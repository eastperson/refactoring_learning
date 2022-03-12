package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Dashboard {

    public static void main(String[] args) throws IOException {
        ReviewerDashboard reviewerDashboard = new ReviewerDashboard();
        reviewerDashboard.printUsernames();

        ParticipantDashboard participantDashboard = new ParticipantDashboard();
        participantDashboard.printUsernames();
    }

    public void printUsernames() throws IOException {
        GHIssue issue = getGhIssue();
        Set<String> reviewers = new HashSet<>();
        issue.getComments().forEach(c -> reviewers.add(c.getUserName()));
        print(reviewers);
    }


    private GHIssue getGhIssue() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        return repository.getIssue(30);
    }

    private void print(Set<String> targets) {
        targets.forEach(System.out::println);
    }
}
