package com.portfolio.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Screenshots {
    private Screenshots() {}
    public static void capture(WebDriver driver, String name) {
        try {
            Path folder = Path.of("target", "screenshots");
            Files.createDirectories(folder);
            String safeName = name.replaceAll("[^a-zA-Z0-9_-]", "_");
            Path destination = folder.resolve(safeName + "_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss_SSS")) + ".png");
            Files.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE).toPath(), destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) { System.err.println("Screenshot capture failed: " + e.getMessage()); }
    }
}
