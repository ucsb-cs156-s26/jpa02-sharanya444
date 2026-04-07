package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
    
        assertEquals("Sharanya", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("sharanya444", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team t = Developer.getTeam();
        assertEquals("s26-16", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Ivy() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Ivy"), "Team should contain Ivy");
    }

    @Test
    public void getTeam_returns_team_with_Jack() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Jack"), "Team should contain Jack");
    }

    @Test
    public void getTeam_returns_team_with_John() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("John"), "Team should contain John");
    }

    @Test
    public void getTeam_returns_team_with_Nikita() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Nikita"), "Team should contain Nikita");
    }

    @Test
    public void getTeam_returns_team_with_Rohil() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Rohil"), "Team should contain Rohil");
    }

    @Test
    public void getTeam_returns_team_with_Sharanya() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Sharanya"), "Team should contain Sharanya");
    }

}
