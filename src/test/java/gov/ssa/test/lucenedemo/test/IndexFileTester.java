/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.ssa.test.lucenedemo.test;

import gov.ssa.test.lucenedemo.IndexFiles;
import gov.ssa.test.lucenedemo.SearchFiles;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lisner
 */
public class IndexFileTester
{
    String docsDir = "/Users/lisner/Documents/lucene_demo/docs";
    String idxDir = "/Users/lisner/Documents/lucene_demo/index";

    public IndexFileTester() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testIndexing()
    {
        IndexFiles iFiles = new IndexFiles();
        iFiles.doIndexing(idxDir, docsDir);
        SearchFiles sFiles = new SearchFiles();
        sFiles.findThisString(idxDir, "maybe");
    }
}
