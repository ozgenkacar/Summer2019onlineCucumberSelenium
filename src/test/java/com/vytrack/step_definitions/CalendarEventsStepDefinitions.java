package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;

import java.util.List;

public class CalendarEventsStepDefinitions {
/*
@Then("user verifies that column names are displayed")
public void user_verifies_that_column_names_are_displayed(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new cucumber.api.PendingException();
}
 */



        //    And user verifies that column names are displayed
//            | TITLE             |
//            | CALENDAR          |
//            | START             |
//            | END               |
//            | RECURRENT         |
//            | RECURRENCE        |
//            | INVITATION STATUS |

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        @Then("user verifies that column names are displayed")
        public void user_verifies_that_column_names_are_displayed(List<String> dataTable) {
            System.out.println(dataTable);
            calendarEventsPage.waitUntilLoaderMaskDisappear();
            BrowserUtils.wait(10);
            Assert.assertEquals(dataTable, calendarEventsPage.getColumnNames());
        }
    }
