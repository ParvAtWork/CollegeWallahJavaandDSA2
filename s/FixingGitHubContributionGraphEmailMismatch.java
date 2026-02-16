/**
 * Title: Fixing GitHub Contribution Graph (Email Mismatch)
 * Author: Parv Maheshwari
 * Date: February 16, 2026
 *
 * Description:
 * This note documents the complete process followed to resolve
 * the issue of GitHub contributions not showing up due to
 * commit email mismatch. It explains the problem, solution,
 * and commands used step-by-step.
 */



    /**
     * Problem:
     * - GitHub contributions graph was not showing commits.
     * - Commits were made with email: maheshwariparv4@gmail.com
     * - GitHub account email: parvmaheshwari.dev@gmail.com
     * - Contributions only count when commit email matches GitHub account email.
     */

    // Step 1: Check current commit email
    // Command:
    // git config user.email

    // Step 2: Set correct email for future commits
    // Command:
    // git config --global user.email "parvmaheshwari.dev@gmail.com"
    // Verify:
    // git config user.email

    // Step 3: Backup repo (optional safety)
    // Command:
    // git clone --mirror https://github.com/ParvAtWork/CollegeWallahJavaandDSA2.git backup-repo

    // Step 4: Rewrite old commits with correct email
    // Command:
    // git filter-branch --env-filter '
    // if [ "$GIT_COMMITTER_EMAIL" = "maheshwariparv4@gmail.com" ]
    // then
    //     GIT_COMMITTER_EMAIL="parvmaheshwari.dev@gmail.com"
    //     GIT_AUTHOR_EMAIL="parvmaheshwari.dev@gmail.com"
    // fi
    // ' -- --all

    // Step 5: Force push rewritten history to GitHub
    // Command:
    // git push --force origin main

    // Step 6: Verify commits
    // Command:
    // git log
    // Output should show:
    // Author: ParvMaheshwari <parvmaheshwari.dev@gmail.com>

    /**
     * Knowledge Section (Extra Useful Commands):
     *
     * 1. git status
     *    - Shows current branch, staged changes, unstaged changes, and untracked files.
     *    - Useful to confirm if working directory is clean before rewriting history.
     *
     * 2. git stash
     *    - Temporarily saves unstaged changes without committing them.
     *    - Command:
     *      git stash
     *    - To restore changes later:
     *      git stash pop
     *    - Useful when you want a clean repo for operations like filter-branch.
     */

    /**
     * Result:
     * - Commit history successfully rewritten with correct email.
     * - Contributions graph will now reflect commits.
     * - Note: GitHub graph may take up to 24 hours to update.
     */


