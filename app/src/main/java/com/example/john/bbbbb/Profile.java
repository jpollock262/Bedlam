package com.example.john.bbbbb;

/**
 * Created by Tyler on 11/24/2015.
 */
public class Profile {

    public static int overallScore = 0;

    public static Power power1 = new Power("power1", 'n', 'n', 1);
    public static Power power2 = new Power("power2", 'n', 'n', 2);
    public static Power power3 = new Power("power1", 'n', 'n', 3);
    public static Power power4 = new Power("power4", 'n', 'n', 4);
    public static Hero profileHero = new Hero("profile", 1, 1, 1, 'n', power1, power2, power3, power4, 1);
    public static int MAX_HEALTH = 0;
    public static int PROFILE_ID = 0;

    public static int powerSelection = 0;
    public static int enemyPowerSelection = 0;
    public static boolean initCheck = false;
    public static int textCounter = 0;
    public static int fighting = 0;
    public static int largestAtk = 0;
    public static int largestCrit = 0;
    public static int highScore = 0;
    public static int shortestBattle = 0;
    public static int longestBattle = 0;

    public static Power enemyPower1 = new Power("enemyPower1", 'n', 'n', 1);
    public static Power enemyPower2 = new Power("enemyPower2", 'n', 'n', 2);
    public static Power enemyPower3 = new Power("enemyPower3", 'n', 'n', 3);
    public static Power enemyPower4 = new Power("enemyPower1", 'n', 'n', 4);
    public static Enemy currentEnemy = new Enemy("currentEnemy", 1, 1, 1, 1, enemyPower1, enemyPower2, enemyPower3, enemyPower4, 'n', 1);

    public static int progress = 0;

    public static boolean avoidedNurse = false;
    public static boolean sparedFrisk = false;
}
