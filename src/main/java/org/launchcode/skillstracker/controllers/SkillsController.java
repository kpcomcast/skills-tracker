package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    private static String uName = "";
    private static String fChoice = "";
    private static String sChoice = "";
    private static String tChoice = "";

    @GetMapping
    @ResponseBody
    public String startSkills() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>VisualBasic</li>" +
                "<li>JavaScript</li>" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String skillForm() {
        return "<form method='post'>" +
                "Name:" +
                "<input type='text' name='username'/>" +
                "<br>My favorite language:<br>" +
                "<select name='first'>" +
                "<option>Java</option>" +
                "<option>VisualBasic</option>" +
                "<option>JavaScript</option>" +
                "</select>" +
                "<br>My second favorite language:<br>" +
                "<select name='second'>" +
                "<option>Java</option>" +
                "<option>VisualBasic</option>" +
                "<option>JavaScript</option>" +
                "</select>" +
                "<br>My third favorite language:<br>" +
                "<select name='third'>" +
                "<option>Java</option>" +
                "<option>VisualBasic</option>" +
                "<option>JavaScript</option>" +
                "</select><br>" +
                "<input type='submit'>" +
                "</form>";
    }

    @PostMapping("/form")
    @ResponseBody
    // name --> String
    // favorite --> String
    // second --> String
    // third --> String
    public String formResults(@RequestParam String username, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        uName = username;
        fChoice = first;
        sChoice = second;
        tChoice = third;
        return "<h1>" + username + "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>";
    }

    @GetMapping("/results")
    @ResponseBody
    public String startResults() {
        return "<h1>Results</h1>" +
                "<h2>Name: " + uName + "</h2>" +
                "<ol>" +
                "<li>" + fChoice + "</li>" +
                "<li>" + sChoice + "</li>" +
                "<li>" + tChoice + "</li>" +
                "</ol>";
    }

}
