### 1.环境准备：java8，maven
### 2.项目核心代码：
/IdeaProjects/EvoSuite-IDEA/com.example/src的目录结构如下, main/java里放置被测代码
```
.
├── main
│   └── java
│       ├── AVLNode.java
│       ├── Tree.java
│       └── TreePrinter.java
└── test
    └── java
        └── evosuite-tests
            ├── AVLNode_ESTest.java
            ├── AVLNode_ESTest_scaffolding.java
            ├── TreePrinter_ESTest.java
            ├── TreePrinter_ESTest_scaffolding.java
            ├── Tree_ESTest.java
            └── Tree_ESTest_scaffolding.java
```
### 3.使用maven生成编译后的字节码
maven命令为
```
mvn clean install
```
编译后的字节码存放在IdeaProjects/EvoSuite-IDEA/com.example/target，目录结构为：
```
.
├── classes
│   ├── AVLNode.class
│   ├── AVLTree
│   ├── Tree.class
│   └── TreePrinter.class
......
└── testproject-1.0-SNAPSHOT.jar
```
### 4.生成unit test
使用https://github.com/runboo-fly/evosuite_LLM中的evosuite.jar文件。该jar文件已上传到本项目。
使用此jar文件对本项目testproject生成unit test的命令为：
```
java -jar target/evosuite-master-1.2.1-SNAPSHOT.jar \
-base_dir yourpath/src/test/java \
--generateSuite \
-projectCP yourpath/com.example/classes:yourpath/target/testproject-1.0-SNAPSHOT.jar  \
-target yourpath/target/classes
```
其中```target/evosuite-master-1.2.1-SNAPSHOT.jar```为evosuite_LLM项目所生成的jar文件；
```-base_dir```指定输出unit test的位置，```-projectCP```指定工作路径，为第3步中生成的target.classes文件和jar包所在路径，```-target```指定被测代码路径，为第3步中生成的target文件所在路径。若想测试单个类，请使用```-class <args>```
