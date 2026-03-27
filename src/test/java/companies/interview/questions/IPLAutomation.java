package companies.interview.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IPLAutomation {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver wd = new ChromeDriver(options);
        wd.get("https://www.iplt20.com/points-table/men/2025");

        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(30));
        By tableLocator = By.className("ih-td-tab");
        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(tableLocator));

        By tbodyLocator = By.id("pointsdata");
        WebElement tbody = table.findElement(tbodyLocator);

        By trLocator = By.tagName("tr");
        List<WebElement> tableRowList = tbody.findElements(trLocator);

        List<Team> teamList = new ArrayList<>();

        for(WebElement row: tableRowList){
            By tableDataRowLocator = By.tagName("td");
            List<WebElement> tableDataRowList = row.findElements(tableDataRowLocator);
            //for(WebElement tableData: tableDataRowList){
               // System.out.println(tableData.getText());

                Team team = new Team(tableDataRowList.get(0).getText(),tableDataRowList.get(2).getText(),
                        Double.parseDouble(tableDataRowList.get(7).getText()),Integer.parseInt(tableDataRowList.get(10).getText()));
                teamList.add(team);
            //}
        }

//        for(Team data: teamList){
//            System.out.println(data);
//        }

//        teamList.stream().forEach(i-> System.out.println(i));
//
//        teamList.stream().map(i->i.getTeamName()).forEach(i-> System.out.println(i));
//
//        teamList.stream().map(i->i.getPoints()).forEach(i-> System.out.println(i));

//        teamList.stream().filter(i->i.getPoints()==19).map(i->i.getTeamName()).forEach(i-> System.out.println(i));

        int maxPoints = teamList.stream().mapToInt(Team::getPoints).max().orElse(0);

        System.out.println(maxPoints);

        teamList.stream().filter(i -> i.getPoints() == maxPoints).map(Team::getTeamName).forEach(System.out::println);

        Team maxTeamNRR = teamList.stream().filter(i -> i.getPoints() == maxPoints).max(Comparator.comparingDouble(Team::getNrr)).orElse(null);

        System.out.println(maxTeamNRR);

        wd.quit();
    }
}
