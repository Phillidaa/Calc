package com.tts.Calculator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tts.Calculator.Model.CalculatorModel;
import com.tts.Calculator.Service.CalculatorService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Controller
public class CalculatorController {

	@Autowired
	private CalculatorService calc;

	@GetMapping("/add")
	@ResponseBody
	public String getIndexPage(@RequestParam int x, @PathVariable int y) throws Exception {
		CalculatorModel model = new CalculatorModel(x, y);
		return Long.toString(calc.add(model));

	}

}
