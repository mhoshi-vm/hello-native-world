package lol.maki.lab;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = HelloController.class)
class HelloControllerTest {
	@Autowired
	MockMvc mockMvc;

	@Test
	void hello() throws Exception {
		mockMvc.perform(get("/hello").param("name", "Native"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello Native!"));
	}
}