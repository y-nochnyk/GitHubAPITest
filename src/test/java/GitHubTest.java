import static org.testng.Assert.*;

import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GitHubTest {

    private BaseUser baseUser;
    private GitHubUser gitHubUser;
    private RestTemplate restTemplate;
    private static final Logger LOG = Logger.getLogger(GitHubTest.class);

    @BeforeClass
    public void setUp(){
        baseUser = new BaseUser();
        restTemplate = new RestTemplate();
        gitHubUser = restTemplate.getForObject(Endpoints.URL, GitHubUser.class);
        LOG.info("Starting the tests for GitHub API");
    }

    @Test(priority = 1)
    public void urlsShouldBeEqual(){
        assertEquals(Endpoints.URL, gitHubUser.getUrl());
        LOG.info("TEST 1: SUCCESS");
    }

    @Test(priority = 2)
    public void theIdShouldBeMoreOrEqualToOne(){
        assertTrue(gitHubUser.getId() >= 1);
        LOG.info("TEST 2: SUCCESS");
    }

    @Test(priority = 3)
    public void typeShouldBeUser(){
        assertEquals(baseUser.getType(), gitHubUser.getType());
        LOG.info("TEST 3: SUCCESS");
    }

    @Test(priority = 4)
    public void namesShouldBeEqual(){
        assertEquals(baseUser.getName(), gitHubUser.getName());
        LOG.info("TEST 4: SUCCESS");
    }

    @Test(priority = 5)
    public void locationsShouldBeEqual(){
        assertEquals(baseUser.getLocation(), gitHubUser.getLocation());
        LOG.info("TEST 5: SUCCESS");
    }

    @Test(priority = 6)
    public void followersFollowingShouldBeMoreOrEqualToZero(){
        assertTrue(gitHubUser.getFollowers() >= 0);
        assertTrue(gitHubUser.getFollowing() >= 0);
        LOG.info("TEST 6: SUCCESS");
    }

    @Test(priority = 7)
    public void createdAtShouldBeEqual(){
        assertTrue(gitHubUser.getCreated_at().contains(baseUser.getCreated_at()));
        LOG.info("TEST 7: SUCCESS");
    }
}
