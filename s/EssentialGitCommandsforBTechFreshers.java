/**
 * Title: Git Commands Cheat Sheet (Hinglish Version)
 * Author: Parv Maheshwari
 * Date: February 16, 2026
 *
 * Description:
 * Ye note ek B.Tech fresher ke liye hai jo company mein Git use karta hai.
 * Isme commonly used commands aur unka simple Hinglish explanation diya gaya hai.




     * 1. git status
     *    - Batata hai ki tumhare repo mein abhi kya situation hai:
     *      kaunse files staged hain, kaunse unstaged hain, aur kaunse untracked hain.
     *    - Usage:
     *      git status
     *
     * 2. git add
     *    - Changes ko staging area mein dalta hai taaki commit ho sake.
     *    - Usage:
     *      git add filename.java
     *      git add .   // sabhi changes add karne ke liye
     *
     * 3. git commit
     *    - Staged changes ko local repo mein save karta hai.
     *    - Usage:
     *      git commit -m "Meaningful commit message"
     *
     * 4. git push
     *    - Local commits ko GitHub (remote repo) pe bhejta hai.
     *    - Usage:
     *      git push origin main
     *
     * 5. git pull
     *    - Remote repo se latest changes fetch aur merge karta hai.
     *    - Usage:
     *      git pull origin main
     *
     * 6. git clone
     *    - Remote repo ka local copy banata hai.
     *    - Usage:
     *      git clone https://github.com/user/repo.git
     *
     * 7. git branch
     *    - Branches list karta hai, nayi branch banata hai ya delete karta hai.
     *    - Usage:
     *      git branch          // list branches
     *      git branch new-feature
     *
     * 8. git checkout
     *    - Branch switch karne ke liye use hota hai.
     *    - Usage:
     *      git checkout main
     *      git checkout new-feature
     *
     * 9. git merge
     *    - Ek branch ke changes ko dusre branch mein merge karta hai.
     *    - Usage:
     *      git merge new-feature
     *
     * 10. git log
     *     - Commit history dikhata hai.
     *     - Usage:
     *       git log
     *
     * 11. git stash
     *     - Agar tumhare paas changes hain jo commit nahi karna chahte,
     *       toh unhe temporarily save kar deta hai.
     *     - Usage:
     *       git stash
     *       git stash pop   // wapas changes lane ke liye
     *
     * 12. git reset
     *     - Files ko unstaged karta hai ya commits ko undo karta hai.
     *     - Usage:
     *       git reset filename.java
     *       git reset --hard HEAD~1   // last commit hata deta hai
     *
     * 13. git remote -v
     *     - Remote repos ka link dikhata hai jo tumhare local repo se connected hain.
     *     - Usage:
     *       git remote -v
     *
     * 14. git config
     *     - User details set karne ke liye (important for contributions).
     *     - Usage:
     *       git config --global user.name "Your Name"
     *       git config --global user.email "your.email@example.com"
     */



//✅ Key Additions for Freshers
//Daily workflow commands: status, add, commit, push, pull.
//Branching commands: branch, checkout, merge.
//History & recovery: log, stash, reset.
//Configuration: config, remote.