package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertStringToCamelCaseTest {
    private ConvertStringToCamelCase convertStringToCamelCase;

    @Before
    public void setup() {
        convertStringToCamelCase = new ConvertStringToCamelCase();
    }
    @Test
    public void testSomeUnderscoreLowerStart() {
        assertEquals("input: the_Stealth_Warrior",
                "theStealthWarrior", convertStringToCamelCase.toCamelCase("the_Stealth_Warrior"));
    }

    @Test
    public void testSomeDashLowerStart() {
        assertEquals("input: the-Stealth-Warrior",
                "theStealthWarrior", convertStringToCamelCase.toCamelCase("the-Stealth-Warrior"));
    }

    @Test
    public void testShouldWorkWithRandomValues() {
        assertEquals("input: south-desert-side",
                "southDesertSide", convertStringToCamelCase.toCamelCase("south-desert-side"));
    }

    @Test
    public void testLongOne() {
        String input = "You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing" +
                "_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related" +
                "_fields";
        assertEquals("input: You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_" +
                        "provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_" +
                        "as_well_as_all_of_the_other_related_fields",
                "YouHaveChosenToTranslateThisKataForYourConvenienceWeHaveProvidedTheExistingTestCasesUsedForThe" +
                        "LanguageThatYouHaveAlreadyCompletedAsWellAsAllOfTheOtherRelatedFields", convertStringToCamelCase.toCamelCase(input));
    }
}
