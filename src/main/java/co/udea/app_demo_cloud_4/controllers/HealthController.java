package co.udea.app_demo_cloud_4.controllers;

import java.time.Instant;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HealthController
 */
@RestController
public class HealthController {

	@GetMapping("/health")
	public Map<String, String> health(){
		return Map.of(
				"status", "UP",
				"service", "app-demo-cloud-4",
				"timestamp", Instant.now().toString()
				);
	}

}
