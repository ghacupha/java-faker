# Faker

Generates fake data for testing or populating a development database.
Run your tests with realistic data like names, emails, dates, countries...

A Java port of the [Faker ruby gem](https://github.com/stympy/faker/).
The goal was to reuse their locale data files.

[![Build Status](https://travis-ci.org/ghacupha/faker.svg?branch=master)](https://travis-ci.org/ghacupha/faker)

## Installing

    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }

    dependencies {
        compile 'com.github.ghacupha:faker:1.2.5'
    }

You can use ```testCompile``` or ```androidTestCompile```, if you only want to use Faker for testing.

## Usage

    Faker faker = new Faker();
    faker.name().firstName();    // Returns "Aaron"
    faker.company().name();      // Returns "Hirthe-Ritchie"

    Faker faker = new Faker("nl");
    faker.name().firstName();    // Returns "Thijs"

    Faker faker = new Faker();
    faker.pickRandom().fromVarArgs("Mon","Tue","Wed","Thur"); // Return "Tue"

    enum CurrencyEnum{ KES,USD,GBP,EUR }
    Faker faker = new Faker();
    faker.pickRandom().from(CurrencyEnum.class); // Return "GBP"

    String[] workWeek =
                new String[]{"Monday", "Tuesday", "Wednesday", "Friday"};
    List<String> workWeek = Arrays.asList(workWeek)
    Faker faker = new Faker();
    faker.pickRandom().fromCollection(workWeek); // Return "Tue"

For full list of available options, check the [original source](https://github.com/stympy/faker/blob/master/README.md).
We have tried to keep the operations as close as possible.

### Available components

- Ancient
- Address
- App
- Artist
- Beer
- Book
- Bool
- Business
- ChuckNorris
- Cat
- Code
- Color
- Commerce
- Company
- Crypto
- DateAndTime
- Demographic
- Educator
- Esports
- File
- Finance
- Food
- Friends
- GameOfThrones
- Hacker
- HarryPotter
- Hipster
- IdNumber
- Internet
- Job
- LordOfTheRings
- Lorem
- Matz
- Music
- Name
- Number
- Options
- PhoneNumber
- Pokemon
- RickAndMorty
- RockBand
- Shakespeare
- SlackEmoji
- Space
- Stock
- Superhero
- Team
- TwinPeaks
- University
- Witcher
- Yoda
- Zelda
- PickRandom

### Supported Locales
-----
- bg
- ca
- ca-CAT
- da-DK
- de
- de-AT
- de-CH
- en
- en-AU
- en-au-ocker
- en-BORK
- en-CA
- en-GB
- en-IND
- en-NEP
- en-NG
- en-NZ
- en-PAK
- en-SG
- en-UG
- en-US
- en-ZA
- es
- es-MX
- fa
- fi-FI
- fr
- he
- in-ID
- it
- ja
- ko
- nb-NO
- nl
- pl
- pt
- pt-BR
- ru
- sk
- sv
- sv-SE
- tr
- uk
- vi
- zh-CN
- zh-TW

## TODO

 - Implement remaining components:
   - Beer
   - Bitcoin
   - Cat
   - ChuckNorris
   - Code
   - Crypto
   - Educator
   - Finance
   - GameOfThrones
   - Hacker
   - Hipster
   - IDNumber
   - Pokemon
   - Shakespeare
   - Space
   - Placeholdit
   - Superhero
   - StarWars
   - Vehicle

## Contact

Feedback and contributions are welcome.
Feel free to send an [email](mailto:mailnjeru@gmail.com) or submit a pull request.

## License

This code is free to use under the terms of the [MIT license](http://opensource.org/licenses/MIT).
