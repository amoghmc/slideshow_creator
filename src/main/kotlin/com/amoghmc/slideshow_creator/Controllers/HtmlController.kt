package com.amoghmc.slideshow_creator.Controllers

import com.amoghmc.slideshow_creator.Greeting
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping


@Controller
class HtmlController {

	@GetMapping("/")
	fun home(model: Model): String {
		model["title"] = "Homepage"
		return "home"
	}

	@PostMapping("/")
	fun greetingSubmit(@ModelAttribute greeting: Greeting?, model: Model): String? {
		model.addAttribute("greeting", greeting)
		return "result"
	}

}