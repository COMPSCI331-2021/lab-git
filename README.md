Git Branch
======================
In this lab exercise, we will demonstrate how branch can be created on Git. Three developers namely dev1, dev2 and dev3 must add three separate features on the Counter sample.  

### Feature 1 by Dev1 
implement the increment method **incrementToEven()** that increases the counter to the next even number. implement the decrement method **decrementToEven()** that decrease the counter the previous even number.

### Feature 2 by Dev2
implement the increment method **incrementToPrime()** that increases the counter to the next prime number. implement the decrement method **decrementToPrime()** that decrease the counter the previous prime number.

### Feature 3 by Dev3
implement the **countFrequency()** method. This method count the number of word in the given sentence. Also, you must refactor the code implemented by dev1 and dev2. The code refactoring should improve the overall quality of source code such as getting rid of replicate code, apply the standard code convention, etc.

##Development Process
Your team must work on these features on three separately branches namely feature1, feature2 and feature3 before merging them into the master branch. The following steps guide you on the overall process of this development.

<ol>
  <li>Dev1,2,3 - clone the project to local repository using Eclipse</li>
  <li>Dev1,2,3 - implement feature 1,2 and 3 respectively on their own local source code</li>
  <li>Dev1 - stage, commit and push your changes on feature1 branch</li>
  <li>Dev2 - stage, commit and push your changes on feature2 branch</li>
  <li>Dev3 - stage, commit and push your changes on feature3 branch</li>
  <li>Dev1,2,3 - create a pull request to merge from their own branch to the master branch</li>
  <li>team leader approves the pull requests</li>
</ol>

##New Branch, Build and Test
On Eclipse, you can create a new branch by going to Team > switch To > New Branch. Make sure you are on your own branch before making a commit. There are three test scripts in place namely TestFeature1, TestFeature2 and TestFeature3 for testing each feature.  You can test only a feature on your branch by put in goal in maven as **-Dtest=<test script> test**. For example, **-Dtest=TestFeature1 test** is for testing feature 1.

After you commit source code on your branch, github classroom workflow will be executed to test your code. Please make sure your code on the branch pass designated test. The figure below show the log file (can be accessed thrugh Github's Actions tab) after dev1 commit on feature1 branch; testfeature1 is success, while testfeature2 and testfeature3 fails. Similarly, the execution of feature2 branch should have testfeature2 sucess, while testfeature1 and testfeature3 fails.  

![](testrun-github.png)

##Pull Request
The implementation of new features are separately stored on different branches. In order to combine all implementations, we need to merge the source from feature1-3 branches into the master branch. To achieve this, we create pull requests on Github by going to Pull Request tab and click new pull request button. Then, select the branch to merge into master branch, Github will show the comparison of files on master branch and feature branch as the figure below.

![](pull-request1.png)

If there is no conflict in the file, the branches can be automatically merged. However, if there is any conflict, the developer must resolve it when approving the pull request. In this case, you can click on create pull request button and enter the message of this pull request for later approval.


![](pull-request2.png)

On the approval as the figure above shown, Github informs us that there is no conflict so we can choose to merge the pull request. However, if there is conflict as sample shown below, you must resolve the conflict before you can merge it into the master.


![](pull-request3.png)


After that, the implementation of feature will be added into the master branch. You have to repeat the same process to merge all three features into the master branch.
  
After all branches have been merged into the master branch, you have to check if the execution of Github classroom workflow runs successfully without any test fails.
 
![](test-success.png)
