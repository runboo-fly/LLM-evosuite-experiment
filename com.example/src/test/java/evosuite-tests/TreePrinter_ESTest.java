/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 14 12:18:52 GMT 2024
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TreePrinter_ESTest extends TreePrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(57);
      AVLNode<Integer> aVLNode0 = new AVLNode<Integer>(integer0);
      String string0 = TreePrinter.printNode(aVLNode0);
      assertEquals("57 \n    \n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(57);
      AVLNode<Integer> aVLNode0 = new AVLNode<Integer>(integer0);
      AVLNode<Integer> aVLNode1 = aVLNode0.delete(integer0);
      String string0 = TreePrinter.printNode(aVLNode1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer((-58));
      AVLNode<Integer> aVLNode0 = new AVLNode<Integer>(integer0);
      AVLNode<Integer> aVLNode1 = new AVLNode<Integer>(integer0, aVLNode0, aVLNode0);
      AVLNode<Integer> aVLNode2 = new AVLNode<Integer>(integer0, aVLNode0, aVLNode1);
      String string0 = TreePrinter.printNode(aVLNode2);
      assertEquals("   -58       \n  / \\   \n /   \\  \n -58   -58   \n    / \\ \n    -58 -58 \n                \n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TreePrinter treePrinter0 = new TreePrinter();
  }
}