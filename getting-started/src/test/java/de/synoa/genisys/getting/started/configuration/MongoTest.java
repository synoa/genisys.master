package de.synoa.genisys.getting.started.configuration;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.mongodb.MongoClient;

public class MongoTest {

    MongoDB underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new MongoDB();
    }

    @Test
    public void test_createMongoClient() {
        MongoClient mongoClient = underTest.createMongoClient("localhost", 27017, null, null, null);
        assertNull(mongoClient);
    }

}