package group.helix.scenario_dev_app.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class AuthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testLoginPage() throws Exception {
        mockMvc.perform(get("/login"))
            .andExpect(status().isOk()) 
            .andExpect(view().name("login"));
    }

    @Test
    public void testHomePage_RedirectIfNotAuthenticated() throws Exception {
        mockMvc.perform(get("/home"))
            .andExpect(status().is3xxRedirection())  // Check for redirection
            .andExpect(redirectedUrlPattern("**/login")); // Use a pattern to match the URL
    }
}
