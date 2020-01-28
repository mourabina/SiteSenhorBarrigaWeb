package br.com.runTest;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import commons.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target/cucumber.json" }, features = {
				".//src//test//resources//" }, glue = { "web.steps", "configuration", "commons" },

		tags = { "@@TesteValidos" })

public class RunTest extends BaseTest {
	@AfterClass
	public static void sendReport() {
		// Query.insert();
		if (webDriver != null)
			webDriver.quit();
	}

}