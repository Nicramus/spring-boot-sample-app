package hello;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import hello.controller.HostsController;

public class HostsControllerTest {

	private MockMvc mockMvc;
	
    @InjectMocks
    private HostsController hostsController;
 

	// bo tu będzie tak: jakas lista zarejestrowanych hostow
	// klient wysyla co 10 sekund zapytanie restowe i tyle.    
    /**
     * Mockito setup
     */
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(hostsController).build();
	}

	@Test
	public void test() throws Exception {
		String hostControllerPath = "/hosts";
		this.mockMvc.perform(get(hostControllerPath)).andExpect(status().isOk());
	}		
	

}
