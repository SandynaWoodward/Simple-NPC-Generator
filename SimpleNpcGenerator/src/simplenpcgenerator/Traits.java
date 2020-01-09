/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplenpcgenerator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sandyna
 */
public class Traits {
   
    public String SkinColor()   {
        ArrayList<String> skinColorList = new ArrayList<String>();
        skinColorList.add("really light");
        skinColorList.add("light");
        skinColorList.add("medium");
        skinColorList.add("dark");
        skinColorList.add("really dark");
        skinColorList.add("freckled");
        skinColorList.add("scarred");    
        Collections.shuffle(skinColorList);
        String skinColor = skinColorList.get(0);
        return skinColor;
    }
    
    public String EyeColor()   {
        ArrayList<String> eyeColorList = new ArrayList<String>();
        eyeColorList.add("blue");
        eyeColorList.add("brown");
        eyeColorList.add("green");
        eyeColorList.add("hazel");
        eyeColorList.add("gray");
        eyeColorList.add("black");
        eyeColorList.add("red");
        //System.out.println(eyeColorList);

        Collections.shuffle(eyeColorList);
        String eyeColor = eyeColorList.get(0);
        return eyeColor;
    }
    
    public String HairColor()   {
        ArrayList<String> hairColorList = new ArrayList<String>();
        hairColorList.add("white");
        hairColorList.add("brown");
        hairColorList.add("blonde");
        hairColorList.add("red");
        hairColorList.add("gray");
        hairColorList.add("black");
        hairColorList.add("light brown");
        hairColorList.add("dark brown");

        Collections.shuffle(hairColorList);
        String hairColor = hairColorList.get(0);
        return hairColor;
    }
    
    public String HairLength()   {
        ArrayList<String> hairLengthList = new ArrayList<String>();
        hairLengthList.add("completely bald");
        hairLengthList.add("very short");
        hairLengthList.add("short");
        hairLengthList.add("medium");
        hairLengthList.add("long");
        hairLengthList.add("very long");
        hairLengthList.add("patchy");
        hairLengthList.add("receding hair line");

        Collections.shuffle(hairLengthList);
        String hairLength = hairLengthList.get(0);
        return hairLength;
    }
    
    public String Height()  {
        ArrayList<String> heightList = new ArrayList<String>();
        heightList.add("very short");
        heightList.add("short");
        heightList.add("average");
        heightList.add("tall");
        heightList.add("very tall");

        Collections.shuffle(heightList);
        String height = heightList.get(0);
        return height;
    }
    
    public String BodyType()  {
        ArrayList<String> bodyTypeList = new ArrayList<String>();
        bodyTypeList.add("very lean");
        bodyTypeList.add("lean");
        bodyTypeList.add("average");
        bodyTypeList.add("curvy");
        bodyTypeList.add("fat");
        bodyTypeList.add("very fat");
        bodyTypeList.add("muscular");
        bodyTypeList.add("very muscular");
        bodyTypeList.add("morbidly obese");
        bodyTypeList.add("sickly thin");

        Collections.shuffle(bodyTypeList);
        String bodyType = bodyTypeList.get(0);
        return bodyType;
    }
    
    public String Personality()  {
        ArrayList<String> personalityList = new ArrayList<String>();
        personalityList.add("mean");
        personalityList.add("nice");
        personalityList.add("timid");
        personalityList.add("outgoing");
        personalityList.add("crazy");
        personalityList.add("loud");
        personalityList.add("quiet");
        personalityList.add("clever");
        personalityList.add("funny");
        personalityList.add("mysterious");
        personalityList.add("creative");
        personalityList.add("carefree");
        personalityList.add("uptight");

        Collections.shuffle(personalityList);
        String personality = personalityList.get(0);
        return personality;
    }
    
    public String Wealth()  {
        ArrayList<String> wealthList = new ArrayList<String>();
        wealthList.add("no money at all");
        wealthList.add("very poor");
        wealthList.add("poor");
        wealthList.add("enough to survive");
        wealthList.add("modest");
        wealthList.add("rich");
        wealthList.add("moderately rich");
        wealthList.add("extremely rich");
        wealthList.add("in extreme debt");
        wealthList.add("in mild debt");
        wealthList.add("moderate debt");
        wealthList.add("larger than a dragon's treasure hoard");
        wealthList.add("begger, but has a home");
        wealthList.add("homeless");
        wealthList.add("nothing except the clothes currently being worn");

        Collections.shuffle(wealthList);
        String wealth = wealthList.get(0);
        return wealth;
    }
    
    public String randomGender()   {
        ArrayList<String> randomGenderList = new ArrayList<String>();
        randomGenderList.add("no gender");
        randomGenderList.add("other");
        randomGenderList.add("female");
        randomGenderList.add("male");
        
        Collections.shuffle(randomGenderList);
        String randomGender = randomGenderList.get(0);
        return randomGender;
    }
}
