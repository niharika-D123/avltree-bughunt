/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 17 01:17:09 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.insert(2166);
      aVLTree0.delete((-1));
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.height();
      aVLTree0.height();
      aVLTree0.insert((-1));
      aVLTree0.find((-2558));
      aVLTree0.find((-1));
      aVLTree0.insert(0);
      aVLTree0.delete(1);
      aVLTree0.insert((-2558));
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      aVLTree0.getBalance(aVLTree_Node0);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-838));
      aVLTree0.find((-4));
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.height();
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(1);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.delete(54);
      aVLTree0.insert((-669));
      aVLTree_Node0.left = null;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getRoot();
      aVLTree0.find((-1));
      assertEquals(6, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      aVLTree0.delete((-5244));
      aVLTree0.find((-5244));
      aVLTree0.find((-5244));
      aVLTree0.find((-5244));
      aVLTree0.delete(1263);
      aVLTree0.find(0);
      aVLTree0.find((-1));
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1838));
      aVLTree0.delete(653);
      aVLTree0.insert((-5244));
      aVLTree0.insert((-1060));
      aVLTree0.delete(1);
      aVLTree0.insert(27);
      aVLTree0.insert((-993));
      aVLTree0.delete(27);
      aVLTree0.delete((-1838));
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.getRoot();
      aVLTree0.getBalance((AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.height();
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.find((-1));
      aVLTree0.getRoot();
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2529));
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.find((-2529));
      aVLTree_Node0.key = 1;
      aVLTree_Node0.left = aVLTree_Node1;
      // Undeclared exception!
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.insert((-1084));
      aVLTree0.find(0);
      aVLTree0.height();
      // Undeclared exception!
      try { 
        aVLTree0.delete(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1552));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.find((-1));
      aVLTree0.find(2276);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(5439);
      aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2975));
      aVLTree0.insert((-1));
      aVLTree0.insert(0);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.insert(4698);
      aVLTree0.delete(4698);
      aVLTree0.insert(4698);
      aVLTree0.insert((-1607));
      aVLTree0.insert(0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(709);
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.find(0);
      aVLTree0.getRoot();
      aVLTree0.insert(0);
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      // Undeclared exception!
      try { 
        aVLTree0.insert(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      aVLTree0.delete(2516);
      aVLTree0.delete(2516);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(2516);
      aVLTree_Node0.height = (-4630);
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(2516);
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node0.key = (-1);
      AVLTree.Node aVLTree_Node2 = aVLTree_Node1.right;
      aVLTree_Node1.left = null;
      aVLTree0.delete((-1));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.insert((-993));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.height();
      aVLTree0.height();
      aVLTree0.delete((-1476));
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.find((-993));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-993));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      aVLTree0.insert(1);
      aVLTree0.insert((-1291));
      aVLTree0.insert(2166);
      aVLTree0.delete((-1));
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.height();
      aVLTree0.height();
      aVLTree0.insert((-1432));
      aVLTree0.find((-2558));
      aVLTree0.find((-1));
      aVLTree0.insert(0);
      aVLTree0.delete(1);
      aVLTree0.insert((-2558));
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      aVLTree_Node0.height = 0;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.insert((-1));
      aVLTree0.find((-2272));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      int int1 = (-218);
      aVLTree0.insert((-218));
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.delete((-1));
      aVLTree0.insert(int1);
      aVLTree_Node1.left = aVLTree_Node0;
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      int int2 = 1476;
      aVLTree_Node2.right = aVLTree_Node1;
      aVLTree0.delete(int2);
      aVLTree0.getBalance(aVLTree_Node2);
      int int3 = 1;
      aVLTree0.insert(int0);
      aVLTree0.insert(int3);
      int int4 = (-1308);
      aVLTree0.find(int4);
      aVLTree0.height();
      int int5 = 844;
      aVLTree0.delete(int5);
      aVLTree0.height();
      aVLTree0.height();
      int int6 = (-1);
      aVLTree0.delete(int6);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(703);
      aVLTree0.insert(1);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(1);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.insert(0);
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.delete(0);
      aVLTree0.height();
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree_Node2.left = aVLTree_Node0;
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.height();
      int int0 = (-1);
      // Undeclared exception!
      try { 
        aVLTree0.delete(int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1978));
      aVLTree0.delete((-1978));
      aVLTree0.insert(1);
      aVLTree0.insert((-1978));
      aVLTree0.getRoot();
      aVLTree0.insert((-644));
      aVLTree0.insert(2227);
      aVLTree0.insert(0);
      aVLTree0.getRoot();
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.delete((-1978));
      aVLTree0.insert(1595);
      aVLTree0.find(2);
  }
}
