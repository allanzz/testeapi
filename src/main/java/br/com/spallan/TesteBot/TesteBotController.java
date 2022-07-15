package br.com.spallan.TesteBot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteBotController {
	@GetMapping("/webhook")
	public int validaEndpoint(@RequestParam(name="hub.mode") String mode,@RequestParam(name="hub.challenge") int challenge,@RequestParam(name="hub.verify_token") String token) {
		String meuToken="EABCzUCkpNHQBAJXl40tNcVgO0MLuqgTjZC8qzS1eeYhhgFjCB0mu4RvLe8taZCgozje9qbWiY6IVdWEO3WSxKcbuf2qUt6mLhWo6KSrhqU9UFgbnrlNR5vnx2T7EbT8cb3WLnbJyHggH5uvYAoeOkAOSxzohMzddmP7Xj0GJNy6dDAZA7CShXj0sv1LEh6H9p191j2TEHeU90ctb88j";
		if(mode.equals("subscribe")&&token.equals(meuToken)) {
			return challenge;
		}else {
			return 400;
		}
	}

}
