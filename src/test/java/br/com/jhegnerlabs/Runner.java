package br.com.jhegnerlabs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)
public class Runner {


}
