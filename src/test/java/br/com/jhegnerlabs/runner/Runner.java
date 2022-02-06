package br.com.jhegnerlabs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/br/com/jhegnerlabs/features/aprender_cucumber.feature",
        glue = "br.com.jhegnerlabs.steps",
        plugin = "pretty",
        tags = "@esse",
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)
public class Runner {

}
