/*
 * Program Name: FavoriteAnimal
 * Description: This program uses multiple nested switch statements to print a short fact about an animal by allowing
 * a user to select from a set of Animal Classes > Group > Breed || Species || Type.
 * Author: ZAND (Zarex Alvin Daria)
 * History:
 * Date:        Description:                        Programmer Name:
 * 05/18/21     Recoded the program using           ZAND
 *              enhanced Java switch statements.
 */

package com.favorite.animal;
import java.util.Scanner;

// Asks user to select from a set of Animal classes
public class FavoriteAnimal {
    public static void main(String[] args) {
        int animal;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Choose your Favorite Animal");
        System.out.print("\n");
        System.out.println("1. Mammals");
        System.out.println("2. Amphibians");
        System.out.println("3. Insects");
        System.out.println("4. Birds");
        System.out.print("\n");
        System.out.print("Type your choice here: ");

        animal = inputDevice.nextInt();  // holds the value of the selected animal
        switch (animal) {
            // Asks user to select from a set of Mammals
            case 1 -> {
                System.out.print("\n");
                System.out.println("Mammals");
                System.out.println("Choose your Favorite Mammal");
                System.out.print("\n");
                System.out.println("1. Dogs");
                System.out.println("2. Cats");
                System.out.println("3. Horses");
                System.out.println("4. Elephants");
                System.out.println("5. Monkeys");
                System.out.print("\n");
                System.out.print("Type your choice here: ");

                int mammal;
                mammal = inputDevice.nextInt();
                // Asks user to select from a set of dog breed
                switch (mammal) {
                    case 1:
                        System.out.print("\n");
                        System.out.println("Dogs");
                        System.out.println("Choose your Favorite Dog");
                        System.out.println("1. Beagle");
                        System.out.println("2. Labrador");
                        System.out.println("3. Pug");
                        System.out.println("4. Bulldog");
                        System.out.println("5. Chow chow");
                        System.out.print("Type your choice here: ");

                        int dog;
                        dog = inputDevice.nextInt();

                        // Shows facts about the selected dog breed.
                        switch (dog) {
                            case 1 -> System.out.println("The beagle is a breed of small hound that is similar " +
                                    "in appearance to the much larger foxhound. The beagle is a scent hound, " +
                                    "developed primarily for hunting hare.");
                            case 2 -> System.out.println("The Labrador Retriever, or just Labrador, is a large breed of " +
                                    "retriever-gun dog. The Labrador is the most popular breed of dog in Canada, " +
                                    "the United Kingdom, and the United States.");
                            case 3 -> System.out.println("The pug is a breed of dog with physically distinctive features of " +
                                    "a wrinkly, short-muzzled face, and curled tail. The breed has a fine, glossy " +
                                    "coat that comes in a variety of colours, most often fawn or black, and a " +
                                    "compact square body with well-developed muscles.");
                            case 4 -> System.out.println("The Bulldog, also known as the British Bulldog or English Bulldog, " +
                                    "is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face" +
                                    " and a distinctive pushed-in nose.");
                            case 5 -> System.out.println("The Chow-Chow is a dog breed originally from northern China, where " +
                                    "it is referred to as Songshi-Quan, which means \"puffy-lion dog\".");
                        }

                    // Asks user to choose from cat breed
                    case 2:
                        System.out.println("Cats");
                        System.out.println("Choose your Favorite Cat");
                        System.out.print("\n");
                        System.out.println("1. Persian Cat");
                        System.out.println("2. Russian Blue");
                        System.out.println("3. Bengal Cat");
                        System.out.println("4. Siamese Cat");
                        System.out.println("5. Munchkin Cat");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");

                        int cat;
                        cat = inputDevice.nextInt();

                        // Shows facts about the selected cat breed
                        switch (cat) {
                            case 1 -> System.out.println("The Persian cat is a long-haired breed of cat characterized by its" +
                                    " round face and short muzzle. It is also known as the \"Persian Longhair\" in " +
                                    "the English-speaking countries. In the Middle East region, they are widely" +
                                    " known as \"Iranian cat\" and in Iran they are known as \"Shiraz cat\".");
                            case 2 -> System.out.println("The Russian Blue is a cat breed that comes in colors varying from" +
                                    " a light shimmering silver to a darker, slate grey. Their short, dense coat" +
                                    " has been the hallmark of the Russian breed for more than a century. " +
                                    "The dense coat stands out from the body.");
                            case 3 -> System.out.println("The Bengal cat is a domesticated cat breed created from hybrids " +
                                    "of domestic cats, the Asian leopard cat and the Egyptian Mau, which gives" +
                                    " them their golden shimmer – the breed name comes from the taxonomic name.");
                            case 4 -> System.out.println("The Siamese cat is one of the first distinctly recognized breeds" +
                                    " of Asian cat. Derived from the Wichianmat landrace, one of several varieties" +
                                    " of cat native to Thailand, the Siamese became one of the most popular breeds " +
                                    "in Europe and North America in the 19th century.");
                            case 5 -> System.out.println("The Munchkin cat or Sausage cat is a newer breed of cat " +
                                    "characterized by its very short legs, which are caused by a genetic mutation. " +
                                    "Much controversy erupted over the breed when it was recognized by The " +
                                    "International Cat Association in 1995 with critics voicing concern over " +
                                    "potential health and mobility issues.");
                        }

                    // Asks user to select from horse breed
                    case 3:
                        System.out.println("Horses");
                        System.out.println("Choose your Favorite Horse");
                        System.out.print("\n");
                        System.out.println("1. Arabian horse");
                        System.out.println("2. Friesian horse");
                        System.out.println("3. Thoroughbred");
                        System.out.println("4. Mustang");
                        System.out.println("5. Percheron");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");

                        int horse;
                        horse = inputDevice.nextInt();

                        // Shows facts about the selected horse breed
                        switch (horse) {
                            case 1 -> System.out.println("The Arabian or Arab horse is a breed of horse that originated" +
                                    " on the Arabian Peninsula. With a distinctive head shape and high tail " +
                                    "carriage, the Arabian is one of the most easily recognizable horse breeds in " +
                                    "the world.");
                            case 2 -> System.out.println("The Friesian is a horse breed originating in Friesland, in the " +
                                    "Netherlands. Although the conformation of the breed resembles that of a light" +
                                    " draught horse, Friesians are graceful and nimble for their size.");
                            case 3 -> System.out.println("The Thoroughbred is a horse breed best known for its use in horse " +
                                    "racing. Although the word thoroughbred is sometimes used to refer to any " +
                                    "breed of purebred horse, it technically refers only to the Thoroughbred " +
                                    "breed.");
                            case 4 -> System.out.println("The mustang is a free-roaming horse of the Western United States, " +
                                    "descended from horses brought to the Americas by the Spanish. Mustangs are " +
                                    "often referred to as wild horses, but because they are descended from " +
                                    "once-domesticated horses, they are actually feral horses.");
                            case 5 -> System.out.println("The Percheron is a breed of draft horse that originated in the" +
                                    " Huisne river valley in western France, part of the former Perche province" +
                                    " from which the breed takes its name. Usually gray or black in color, " +
                                    "Percherons are well muscled, and known for their intelligence and " +
                                    "willingness to work.");
                        }

                        // Asks user to select from Elephant breed
                    case 4:
                        System.out.println("Elephants");
                        System.out.println("Choose your Favorite Elephant");
                        System.out.print("\n");
                        System.out.println("1. Indian elephant");
                        System.out.println("2. Asian elephant");
                        System.out.println("3. African forest elephant");
                        System.out.println("4. Palaeoloxodon falconeri");
                        System.out.println("5. Sri Lankan elephant");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");

                        int elephant;
                        elephant = inputDevice.nextInt();

                        // Shows facts about the selected elephant
                        switch (elephant) {
                            case 1 -> System.out.println("The Indian elephant is one of three extant recognised subspecies" +
                                    " of the Asian elephant and native to mainland Asia. Since 1986, the Asian" +
                                    " elephant has been listed as Endangered on the IUCN Red List as the wild " +
                                    "population has declined by at least 50% since the 1930s to 1940s, i.e. three" +
                                    " elephant generations");
                            case 2 -> System.out.println("The Asian elephant, also called Asiatic elephant, is the only " +
                                    "living species of the genus Elephas and is distributed throughout the Indian " +
                                    "subcontinent and Southeast Asia, from India in the west, Nepal in the north," +
                                    " Sumatra in the south, and to Borneo in the east.");
                            case 3 -> System.out.println("The African forest elephant is an African elephant species native" +
                                    " to humid forests in West Africa and the Congo Basin. It is the smallest of" +
                                    " the three living elephant species, reaching a shoulder height of 2.4 m. Both " +
                                    "sexes have straight, downpointing tusks, which erupt when they are 1–3 " +
                                    "years old.");
                            case 4 -> System.out.println("Palaeoloxodon falconeri, also known as the pygmy elephant, is an " +
                                    "extinct Siculo-Maltese species of elephant that was derived from the " +
                                    "straight-tusked elephant.");
                            case 5 -> System.out.println("The Sri Lankan elephant is one of three recognised subspecies of" +
                                    " the Asian elephant, and native to Sri Lanka. Since 1986, Elephas maximus " +
                                    "has been listed as endangered by IUCN as the population has declined by at" +
                                    " least 50% over the last three generations, estimated to be 60–75 years.");
                        }

                        // Asks user to choose from selected monkey breed
                    case 5:
                        System.out.println("Monkeys");
                        System.out.println("Choose your Favorite Monkey");
                        System.out.print("\n");
                        System.out.println("1. Rhesus macaque");
                        System.out.println("2. Japanese macaque");
                        System.out.println("3. Proboscis monkey");
                        System.out.println("4. Emperor tamarin");
                        System.out.println("5. Hamadryas baboon");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");

                        int monkey;
                        monkey = inputDevice.nextInt();

                        // Shows facts about the selected monkey breed
                        switch (monkey) {
                            case 1 -> System.out.println("The rhesus macaque is one of the best-known species of Old World" +
                                    " monkeys. It is listed as Least Concern in the IUCN Red List of Threatened " +
                                    "Species in view of its wide distribution, presumed large population, and " +
                                    "its tolerance of a broad range of habitats.");
                            case 2 -> System.out.println("The Japanese macaque, also known as the snow monkey, is a " +
                                    "terrestrial Old World monkey species that is native to Japan. They get " +
                                    "their name \"snow monkey\" because they live in areas where snow covers " +
                                    "the ground for months each year – no other nonhuman primate is more " +
                                    "northern-living, nor lives in a colder climate.");
                            case 3 -> System.out.println("The proboscis monkey or long-nosed monkey, known as the " +
                                    "bekantan in Indonesia, is a reddish-brown arboreal Old World monkey with an " +
                                    "unusually large nose. It is endemic to the southeast Asian island of Borneo." +
                                    " This species co-exists with the Bornean orangutan. It belongs in the " +
                                    "monotypic genus Nasalis.");
                            case 4 -> System.out.println("The emperor tamarin, is a species of tamarin allegedly named for" +
                                    " its resemblance to the German emperor Wilhelm II. It lives in the " +
                                    "southwest Amazon Basin, in east Peru, north Bolivia and in the west " +
                                    "Brazilian states of Acre and Amazonas.");
                            case 5 -> System.out.println("The hamadryas baboon is a species of baboon from the Old World " +
                                    "monkey family. It is the northernmost of all the baboons, being native to" +
                                    " the Horn of Africa and the southwestern tip of the Arabian Peninsula.");
                        }
                }
            }
            // Asks user to select from a set of Amphibians
            case 2 -> {
                System.out.println("Amphibians");
                System.out.println("Choose your Favorite Amphibian");
                System.out.print("\n");
                System.out.println("1. Frogs");
                System.out.println("2. Toads");
                System.out.println("3. Salamander");
                System.out.println("4. Caecilians");
                System.out.println("5. Amphiuma");
                System.out.print("\n");
                System.out.print("Type your choice here: ");
                int amphibian;
                amphibian = inputDevice.nextInt();
                // Asks user to select from a set of frog species
                switch (amphibian) {
                    case 1:
                        System.out.println("Frogs");
                        System.out.println("Choose your Favorite Frog");
                        System.out.print("\n");
                        System.out.println("1. American bullfrog");
                        System.out.println("2. Common frog");
                        System.out.println("3. Wood frog");
                        System.out.println("4. Gray tree frog");
                        System.out.println("5. Northern leopard frog");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");

                        int frog;
                        frog = inputDevice.nextInt();

                        // Shows facts about the selected frog
                        switch (frog) {
                            case 1 -> System.out.println("The American bullfrog, often simply known as the bullfrog in " +
                                    "Canada and the United States, is an amphibious frog, a member of the family" +
                                    " Ranidae, or \"true frogs\". This frog has an olive green back and sides " +
                                    "blotched with brownish markings and a whitish belly spotted with yellow" +
                                    " or grey.");
                            case 2 -> System.out.println("The common frog, also known as the European common frog, " +
                                    "European common brown frog, or European grass frog, is a semi-aquatic " +
                                    "amphibian of the family Ranidae, found throughout much of Europe as far" +
                                    " north as Scandinavia and as far east as the Urals, except for most of" +
                                    " Iberia, southern Italy, and the southern Balkans.");
                            case 3 -> System.out.println("The wood frog has a broad distribution over North America," +
                                    " extending from the boreal forest of the north to the southern " +
                                    "Appalachians, with several notable disjunct populations including " +
                                    "lowland eastern North Carolina.");
                            case 4 -> System.out.println("The gray treefrog (Hyla versicolor) is a species of small" +
                                    "arboreal frog native to much of the eastern United States and " +
                                    "southeastern Canada. It is sometimes referred to as the eastern gray " +
                                    "treefrog, common gray treefrog, or tetraploid gray treefrog to " +
                                    "distinguish it from its more southern, genetically disparate relative, " +
                                    "the Cope's gray treefrog (Hyla chrysoscelis).");
                            case 5 -> System.out.println("The northern leopard frog is a species of leopard frog from " +
                                    "the true frog family, native to parts of Canada and the United States. " +
                                    "It is the state amphibian of Minnesota and Vermont.");
                        }

                        // Asks user to select from toad breeds
                    case 2:
                        System.out.println("Toad");
                        System.out.println("Choose your Favorite Toad");
                        System.out.print("\n");
                        System.out.println("1. Cane toad");
                        System.out.println("2. Common toad");
                        System.out.println("3. American toad");
                        System.out.println("4. Natterjack toad");
                        System.out.println("5. European green toad");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");

                        int toad;
                        toad = inputDevice.nextInt();
                        // Shows fact about the selected toad breed
                        switch (toad) {
                            case 1 -> System.out.println("The cane toad, also known as the giant neotropical toad or " +
                                    "marine toad, is a large, terrestrial true toad native to South and " +
                                    "mainland Central America, but which has been introduced to various islands" +
                                    " throughout Oceania and the Caribbean, as well as Northern Australia. It " +
                                    "is the world's largest toad.");
                            case 2 -> System.out.println("The common toad, European toad, or in Anglophone parts of Europe," +
                                    " simply the toad, is an amphibian found throughout most of Europe, in the" +
                                    " western part of North Asia, and in a small portion of Northwest Africa.");
                            case 3 -> System.out.println("The American toad is a common species of toad found throughout " +
                                    "the eastern United States and Canada. It is divided into three subspecies—the" +
                                    " eastern American toad, the dwarf American toad, and the rare Hudson Bay toad." +
                                    " Recent taxonomic treatments place this species in the genus Anaxyrus " +
                                    "instead of Bufo.");
                            case 4 -> System.out.println("The natterjack toad is a toad native to sandy and heathland areas " +
                                    "of Europe. Adults are 60–70 mm in length and are distinguished from common " +
                                    "toads by a yellow line down the middle of the back, and parallel" +
                                    " paratoid glands.");
                            case 5 -> System.out.println("The European green toad is a species of toad found in mainland" +
                                    " Europe. It lives in many habitats, including steppes, mountainous areas," +
                                    " semi-deserts, and urban areas. The species comprises at least 12 major" +
                                    " evolutionary lineages, and there are variations in the color and pattern " +
                                    "of this toad across its range.");
                        }

                        // Asks user to select from a set of Salamander breed
                    case 3:
                        System.out.println("Salamander");
                        System.out.println("Choose your Favorite Salamander");
                        System.out.print("\n");
                        System.out.println("1. Chinese giant salamander");
                        System.out.println("2. Tiger salamander");
                        System.out.println("3. Spotted salamander");
                        System.out.println("4. Red-backed salamander");
                        System.out.println("5. Eastern newt");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");

                        int salamander;
                        salamander = inputDevice.nextInt();
                        // Shows fact about the selected Salamander breed
                        switch (salamander) {
                            case 1 -> System.out.println("The Chinese giant salamander is one of the largest salamanders" +
                                    " and one of the largest amphibians in the world. It is fully aquatic and" +
                                    " is endemic to rocky mountain streams and lakes in the Yangtze river " +
                                    "basin of central China. Either it or a close relative has been introduced " +
                                    "to Kyoto Prefecture in Japan and Taiwan.");
                            case 2 -> System.out.println("Tiger salamanders grow to a typical length of 6–8 in (15–20 cm) " +
                                    "and a maximum of 14 in (36 cm) in length, particularly neotenic individuals." +
                                    " they usually live up to 25 years. Adults are usually blotchy with grey," +
                                    " green, or black, and have large, lidded eyes. They have short snouts, " +
                                    "thick necks, sturdy legs, and long tails. Their diets consist largely of " +
                                    "small insects and worms, though it is not rare for an adult to consume " +
                                    "small frogs and baby mice.");
                            case 3 -> System.out.println("The spotted salamander or yellow-spotted salamander is a mole " +
                                    "salamander common in the eastern United States and Canada. The spotted " +
                                    "salamander is the state amphibian of Ohio and South Carolina. This " +
                                    "salamander ranges from Nova Scotia, to Lake Superior, to southern " +
                                    "Georgia and Texas.");
                            case 4 -> System.out.println("The red-backed salamander is a species of small, hardy " +
                                    "woodland salamander in the family Plethodontidae. The species inhabits" +
                                    " wooded slopes in eastern North America, west to Missouri, south to " +
                                    "North Carolina, and north from southern Quebec and the Maritime Provinces" +
                                    " in Canada to Minnesota.");
                            case 5 -> System.out.println("The eastern newt is a common newt of eastern North " +
                                    "America. It frequents small lakes, ponds, and streams or near-by wet" +
                                    " forests. The eastern newt produces tetrodotoxin which makes the species " +
                                    "unpalatable to predatory fish and crayfish.");
                        }

                        // Asks user to choose from a set of Caecilian breeds
                    case 4:
                        System.out.println("Caecilians");
                        System.out.println("Choose your Favorite Caecilian");
                        System.out.print("\n");
                        System.out.println("1. Boulengerula taitana");
                        System.out.println("2. Dermophis mexicanus");
                        System.out.println("3. Siphonops annulatus");
                        System.out.println("4. Atretochoana");
                        System.out.println("5. Gegeneophis ramaswamii");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");

                        int caecilian;
                        caecilian = inputDevice.nextInt();
                        // Shows a fact about the selected Caecilian breed
                        switch (caecilian) {
                            case 1 -> System.out.println("Boulengerula taitana is a species of caecilian. It is " +
                                    "endemic to the Taita Hills region of southeast Kenya.");
                            case 2 -> System.out.println("Dermophis mexicanus, the Mexican burrowing caecilian, is a " +
                                    "species of limbless amphibian in the family Dermophiidae. It is found" +
                                    " in Mexico and Central America, where it burrows under leaf litter " +
                                    "and plant debris.");
                            case 3 -> System.out.println("Siphonops annulatus, the ringed caecilian, is a species of " +
                                    "caecilian in the family Siphonopidae from South America. It might have " +
                                    "the broadest known distribution among terrestrial caecilian species.");
                            case 4 -> System.out.println("Atretochoana eiselti is a species of caecilian originally " +
                                    "known only from two preserved specimens discovered by Sir Graham Hales " +
                                    "in the Brazilian rainforest, while on an expedition with Sir Brian Doll" +
                                    " in the late 1800s, but rediscovered in 2011 by engineers working on a" +
                                    " hydroelectric dam project in Brazil.");
                            case 5 -> System.out.println("Gegeneophis ramaswamii, common names Tenmalai caecilian, " +
                                    "Tenmalai blind caecilian, Ramaswami's caecilian, and forest caecilian is " +
                                    "a species of caecilian. It is endemic to the southern portion of the " +
                                    "Western Ghats, India, and is recorded from Kerala and Tamil Nadu. " +
                                    "The specific name ramaswamii honours L. S. Ramaswami, an Indian " +
                                    "herpetologist.");
                        }

                        // Asks user to select from a set of Amphiuma breeds
                    case 5:
                        System.out.println("Amphiuma");
                        System.out.println("Choose your Favorite Amphiuma");
                        System.out.print("\n");
                        System.out.println("1. Two-toed amphiuma");
                        System.out.println("2. Three-toed amphiuma");
                        System.out.println("3. Amphiuma pholeter");
                        System.out.println("4. Lesser siren");
                        System.out.println("5. Northern dwarf siren");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");

                        int amphiuma;
                        amphiuma = inputDevice.nextInt();
                        // Shows facts about the selected amphiuma breed
                        switch (amphiuma) {
                            case 1 -> System.out.println("The two-toed amphiuma is a snake-like salamander found chiefly " +
                                    "in the southeastern United States. It is commonly, but incorrectly, called" +
                                    " \"congo snake\", \"conger eel\" or the \"blind eel\". Two-toed amphiumas " +
                                    "are some of the largest extant amphibians in the world.");
                            case 2 -> System.out.println("The three-toed amphiuma, Amphiuma tridactylum, is a species of " +
                                    "aquatic salamander native to the Southeastern United States.");
                            case 3 -> System.out.println("The one-toed amphiuma is an aquatic, eel-like salamander native" +
                                    " to the southeastern United States. It was unknown to science until 1950," +
                                    " when it was collected by herpetologist W. T. Neill. It is rarely observed in" +
                                    " the wild, and much about the species remains uncertain. ");
                            case 4 -> System.out.println("The lesser siren is a species of aquatic salamander native to " +
                                    "the eastern United States and northern Mexico. They are referred to by " +
                                    "numerous common names, including two-legged eel, dwarf siren, and mud eel.");
                            case 5 -> System.out.println("The northern dwarf siren is a perennibranch salamander lacking" +
                                    " hind legs. Found in the Southeastern United States, it one of two currently" +
                                    " recognized species of dwarf sirens. Three subspecies are currently " +
                                    "recognized; P. s. striatus, the broad-striped dwarf siren, P. s. ");
                        }
                }
            }
            // Asks user to select from a set of Insects
            case 3 -> {
                System.out.println("Insects");
                System.out.println("Choose your Favorite Insect");
                System.out.print("\n");
                System.out.println("1. Bettle");
                System.out.println("2. Ant");
                System.out.println("3. Mosquito");
                System.out.println("4. Butterfly");
                System.out.println("5. Fly");
                System.out.print("\n");
                System.out.print("Choose here: ");
                int insect;
                insect = inputDevice.nextInt();

                // Asks user to select a Bettle type
                switch (insect) {
                    case 1 -> {
                        System.out.println("Bettle");
                        System.out.println("Choose your Favorite Bettle");
                        System.out.print("\n");
                        System.out.println("1. Seven-spot ladybird");
                        System.out.println("2. Colorado potato beetle");
                        System.out.println("3. Hercules beetle");
                        System.out.println("4. Japanese beetle");
                        System.out.println("5. Boll weevil");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");
                        int bettle;
                        bettle = inputDevice.nextInt();
                        // Shows details about the selected bettle type
                        switch (bettle) {
                            case 1 -> System.out.println("One Seven-Spot Ladybird eats about 5500 aphids in its life: " +
                                    "500 as a larva and 5000 as an adult. ... The bright red and black pattern" +
                                    " on the wing cases is an example of warning coloration – when disturbed, " +
                                    "the Seven-Spot Ladybird produces a yellow fluid that tastes vile!");
                            case 2 -> System.out.println("The Colorado potato beetle, also known as the Colorado beetle," +
                                    " the ten-striped spearman, the ten-lined potato beetle or the potato bug, " +
                                    "is a major pest of potato crops. It is approximately 10 millimetres long, " +
                                    "with a bright yellow/orange body and five bold brown stripes along the " +
                                    "length of each of its elytra.");
                            case 3 -> System.out.println("The Hercules beetle (Dynastes hercules, Dynastinae) is a species" +
                                    " of rhinoceros beetle native to the rainforests of Central America, South " +
                                    "America, and the Lesser Antilles, and is the longest extant species of " +
                                    "beetle in the world, and is also one of the largest flying insects in the" +
                                    " world.");
                            case 4 -> System.out.println("The Japanese beetle is a species of scarab beetle. The adult" +
                                    " measures 15 mm in length and 10 mm in width, has iridescent copper-colored" +
                                    " elytra and a green thorax and head.");
                            case 5 -> System.out.println("The boll weevil is a beetle which feeds on cotton buds and " +
                                    "flowers. Thought to be native to Central Mexico, it migrated into the United" +
                                    " States from Mexico in the late 19th century and had infested all U.S. " +
                                    "cotton-growing areas by the 1920s, devastating the industry and the people" +
                                    " working in the American South.");
                        }
                    }
                    // Asks user to select from a set of Ant types
                    case 2 -> {
                        System.out.println("Ant");
                        System.out.println("Choose your Favorite Ant");
                        System.out.print("\n");
                        System.out.println("1. Black garden ant");
                        System.out.println("2. Argentine ant");
                        System.out.println("3. Yellow crazy ant");
                        System.out.println("4. Red imported fire ant");
                        System.out.println("5. Pharaoh ant");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");
                        int ant;
                        ant = inputDevice.nextInt();
                        // Shows facts about the selected ant type
                        switch (ant) {
                            case 1 -> System.out.println("The black garden ant, also known as the common black ant, is a " +
                                    "formicine ant, the type species of the subgenus Lasius, found all over " +
                                    "Europe and in some parts of North America, South America, Asia and " +
                                    "Australasia.");
                            case 2 -> System.out.println("The Argentine ant, formerly Iridomyrmex humilis, is an ant " +
                                    "native to northern Argentina, Uruguay, Paraguay, Bolivia and southern Brazil. ");
                            case 3 -> System.out.println("The yellow crazy ant is a species of ant, introduced " +
                                    "accidentally to northern Australia and Christmas Island in the Indian " +
                                    "Ocean, that has caused ecological damage in both locations and is now " +
                                    "found in the northern suburbs of Brisbane. It is colloquially called " +
                                    "\"crazy\" because of its erratic movements when disturbed.");
                            case 4 -> System.out.println("The red imported fire ant, also known as the fire ant or RIFA," +
                                    " is a species of ant native to South America. A member of the genus " +
                                    "Solenopsis in the subfamily Myrmicinae, it was described by Swiss " +
                                    "entomologist Felix Santschi as a variant in 1916.");
                            case 5 -> System.out.println("The pharaoh ant is a small yellow or light brown, almost " +
                                    "transparent ant notorious for being a major indoor nuisance pest, " +
                                    "especially in hospitals. The pharaoh ant, whose origins are unknown, " +
                                    "has now been introduced to virtually every area of the world, including " +
                                    "Europe, the Americas, Australasia and Southeast Asia.");
                        }
                    }
                    // Asks user to selected from a set of Mosquito type
                    case 3 -> {
                        System.out.println("Mosquito");
                        System.out.println("Choose your Favorite Mosquito");
                        System.out.print("\n");
                        System.out.println("1. Aedes aegypti");
                        System.out.println("2. Culex pipiens");
                        System.out.println("3. Aedes albopictus");
                        System.out.println("4. Culex quinquefasciatus");
                        System.out.println("5. Aedes vexans");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");
                        int mosquito;
                        mosquito = inputDevice.nextInt();
                        // Shows a fact about the selected mosquito type
                        switch (mosquito) {
                            case 1 -> System.out.println("Aedes aegypti, the yellow fever mosquito, is a mosquito that " +
                                    "can spread dengue fever, chikungunya, Zika fever, Mayaro and yellow fever" +
                                    " viruses, and other disease agents. The mosquito can be recognized by" +
                                    " white markings on its legs and a marking in the form of a lyre on the " +
                                    "upper surface of its thorax.");
                            case 2 -> System.out.println("Culex pipiens, widely known as the common house" +
                                    " mosquito or the northern house mosquito, is a member of the order " +
                                    "Diptera. Northern house mosquitoes are some of the most prevalent " +
                                    "mosquitoes in the United States. They are found in regions north of " +
                                    "the 39th parallel in the United States.");
                            case 3 -> System.out.println("Aedes albopictus, from the mosquito family, also known as" +
                                    " tiger mosquito or forest mosquito, is a mosquito native to the" +
                                    " tropical and subtropical areas of Southeast Asia; however, in " +
                                    "the past few decades, this species has spread to many countries " +
                                    "through the transport of goods and international travel.");
                            case 4 -> System.out.println("Culex quinquefasciatus Say, 1823, commonly known as" +
                                    " the southern house mosquito, is a medium-sized mosquito " +
                                    "found in tropical and subtropical regions of the world.");
                            case 5 -> System.out.println("Aedes vexans, the inland floodwater mosquito or tomguito, " +
                                    "is a cosmopolitan and common pest mosquito.");
                        }
                    }

                    // Asks user to select from a set of butterfly types
                    case 4 -> {
                        System.out.println("Butterfly");
                        System.out.println("Choose your Favorite Butterfly");
                        System.out.print("\n");
                        System.out.println("1. Monarch butterfly");
                        System.out.println("2. Painted lady");
                        System.out.println("3. Cabbage white");
                        System.out.println("4. Red admiral");
                        System.out.println("5. Speckled wood");
                        System.out.print("Type your choice here: ");
                        int butterfly;
                        butterfly = inputDevice.nextInt();
                        // Shows a fact about the selected butterfly
                        switch (butterfly) {
                            case 1 -> System.out.println("The monarch butterfly or simply monarch is a milkweed " +
                                    "butterfly in the family Nymphalidae. Other common names depending " +
                                    "on region include milkweed, common tiger, wanderer, and black veined " +
                                    "brown. It may be the most familiar North American butterfly, and is " +
                                    "considered an iconic pollinator species.");
                            case 2 -> System.out.println("Vanessa cardui is a well-known colourful butterfly, known as" +
                                    " the painted lady, or formerly in North America as the cosmopolitan.");
                            case 3 -> System.out.println("Pieris rapae, the small white, is a small- to medium-sized " +
                                    "butterfly species of the whites-and-yellows family Pieridae. It is also" +
                                    " known as the small cabbage white and in New Zealand, simply as white " +
                                    "butterfly. The names \"cabbage butterfly\" and \"cabbage white\" can also" +
                                    " refer to the large white.");
                            case 4 -> System.out.println("Vanessa atalanta, the red admiral or previously, the red " +
                                    "admirable, is a well-characterized, medium-sized butterfly with black " +
                                    "wings, orange bands, and white spots. It has a wingspan of about 2 inches." +
                                    " It was first described by Carl Linnaeus in his 1758 10th edition of " +
                                    "Systema Naturae.");
                            case 5 -> System.out.println("The speckled wood is a butterfly found in and on the borders " +
                                    "of woodland areas throughout much of the Palearctic ecozone. The species " +
                                    "is subdivided into multiple subspecies, including Pararge aegeria aegeria, " +
                                    "Pararge aegeria tircis, Pararge aegeria oblita, and Pararge aegeria insula.");
                        }
                    }
                    // Asks user to select from a set of fly types
                    case 5 -> {
                        System.out.println("Fly");
                        System.out.println("Choose your Favorite Fly");
                        System.out.print("\n");
                        System.out.println("1. Blow flies");
                        System.out.println("2. Housefly");
                        System.out.println("3. Horse-fly");
                        System.out.println("4. Flesh fly");
                        System.out.println("5. Blue bottle fly");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");
                        int fly;
                        fly = inputDevice.nextInt();
                        // Shows detail about the selected fly type
                        switch (fly) {
                            case 1 -> System.out.println("The Calliphoridae are a family of insects in the order Diptera, " +
                                    "with 1,200 known species. The maggot larvae, often used as fishing bait, " +
                                    "are known as gentles.");
                            case 2 -> System.out.println("The housefly is a fly of the suborder Cyclorrhapha. It is " +
                                    "believed to have evolved in the Cenozoic era, possibly in the Middle " +
                                    "East, and has spread all over the world as a commensal of humans. It is " +
                                    "the most common fly species found in houses.");
                            case 3 -> System.out.println("Horse-flies or horseflies are true flies in the family " +
                                    "Tabanidae in the insect order Diptera. They are often large and agile in " +
                                    "flight, and the females bite animals, including humans, to obtain blood. " +
                                    "They prefer to fly in sunlight, avoiding dark and shady areas, and are " +
                                    "inactive at night.");
                            case 4 -> System.out.println("Flies in the family Sarcophagidae are commonly known as flesh " +
                                    "flies. They differ from most flies in that they are ovoviviparous, " +
                                    "opportunistically depositing hatched or hatching maggots instead of eggs" +
                                    " on carrion, dung, decaying material, or open wounds of mammals, hence" +
                                    " their common name.");
                            case 5 -> System.out.println("Calliphora vomitoria, known as the blue bottle fly, " +
                                    "orange-bearded blue bottle, or bottlebee is a common blow fly, a " +
                                    "species in the family Calliphoridae. Calliphora vomitoria is the type " +
                                    "species of the genus Calliphora. It is relatively common throughout many" +
                                    " widespread regions throughout the world.");
                        }
                    }
                }
            }
            // Asks user to select from a set of Birds
            case 4 -> {
                System.out.println("Birds");
                System.out.println("Choose your Favorite Bird");
                System.out.print("\n");
                System.out.println("1. Parrot");
                System.out.println("2. Owl");
                System.out.println("3. Hummingbird");
                System.out.println("4. Penguin");
                System.out.println("5. Swallow");
                System.out.print("\n");
                System.out.print("Type your choice here: ");
                int bird;
                bird = inputDevice.nextInt();

                // Asks user to select a parrot specie
                switch (bird) {
                    case 1 -> {
                        System.out.println("Parrot");
                        System.out.println("Choose your Favorite Parrot");
                        System.out.print("\n");
                        System.out.println("1. Grey parrot");
                        System.out.println("2. Budgerigar");
                        System.out.println("3. Cockatiel");
                        System.out.println("4. Monk parakeet");
                        System.out.println("5. Rose-ringed parakeet");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");
                        int parrot;
                        parrot = inputDevice.nextInt();
                        // Shows facts about the selected parrot
                        switch (parrot) {
                            case 1 -> System.out.println("The grey parrot, also known as the Congo grey parrot, Congo " +
                                    "African grey parrot or African grey parrot, is an Old World parrot in the" +
                                    " family Psittacidae. The Timneh parrot was earlier treated as a subspecies " +
                                    "but has since been elevated to a full species.");
                            case 2 -> System.out.println("The budgerigar is a long-tailed, seed-eating parrot usually " +
                                    "nicknamed the budgie, or in American English, the parakeet. Budgies are" +
                                    " the only species in the genus Melopsittacus. Naturally, the species is" +
                                    " green and yellow with black, scalloped markings on the nape, back, and " +
                                    "wings.");
                            case 3 -> System.out.println("The cockatiel, also known as miniature cockatoo, weero, or " +
                                    "quarrion, is a bird that is a member of its own branch of the cockatoo" +
                                    " family endemic to Australia. They are prized as household pets and " +
                                    "companion parrots throughout the world and are relatively easy to breed.");
                            case 4 -> System.out.println("The monk parakeet, also known as the Quaker parrot, is a " +
                                    "species of true parrot in the family Psittacidae. It is a small, " +
                                    "bright-green parrot with a greyish breast and greenish-yellow abdomen. " +
                                    "Its average lifespan is 20–30 years.");
                            case 5 -> System.out.println("The rose-ringed parakeet, also known as the ring-necked " +
                                    "parakeet, is a medium-sized parrot in the genus Psittacula, of the " +
                                    "family Psittacidae.");
                        }
                    }
                    // Asks user to select from a set of owl species
                    case 2 -> {
                        System.out.println("Owl");
                        System.out.println("Choose your Favorite Owl");
                        System.out.print("\n");
                        System.out.println("1. Barn owl");
                        System.out.println("2. Great horned owl");
                        System.out.println("3. Snowy owl");
                        System.out.println("4. Barred Owl");
                        System.out.println("5. Long-eared owl");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");
                        int owl;
                        owl = inputDevice.nextInt();
                        // Shows facts about the selected owl specie
                        switch (owl) {
                            case 1 -> System.out.println("The barn owl is the most widely distributed species of owl " +
                                    "and one of the most widespread of all birds. It is also referred to as" +
                                    " the common barn owl, to distinguish it from other species in its family," +
                                    " Tytonidae, which forms one of the two main lineages of living owls, the " +
                                    "other being the typical owls.");
                            case 2 -> System.out.println("The great horned owl, also known as the tiger owl or the hoot " +
                                    "owl, is a large owl native to the Americas. It is an extremely adaptable" +
                                    " bird with a vast range and is the most widely distributed true owl in the" +
                                    " Americas.");
                            case 3 -> System.out.println("The snowy owl is a large, white owl of the true owl family. " +
                                    "Snowy owls are native to Arctic regions in North America and Eurasia. " +
                                    "Males are almost all white, while females have more flecks of black plumage." +
                                    " Juvenile snowy owls have black feathers until they turn white.");
                            case 4 -> System.out.println("The barred owl, also known as northern barred owl or hoot owl, " +
                                    "is a true owl native to eastern North America. Adults are large, and are " +
                                    "brown to grey with barring on the chest. Barred owls have expanded their " +
                                    "range to the west coast of North America, where they are considered invasive.");
                            case 5 -> System.out.println("The long-eared owl, also known as the northern long-eared owl or," +
                                    " more informally, as the lesser horned owl or cat owl, is a medium-sized " +
                                    "species of owl with an extensive breeding range. The scientific name is " +
                                    "from Latin. The genus name Asio is a type of eared owl, and otus also refers" +
                                    " to a small, eared owl.");
                        }
                    }
                    // Asks user to select from a set of Hummingbird species
                    case 3 -> {
                        System.out.println("Hummingbird");
                        System.out.println("Choose your Favorite Hummingbird");
                        System.out.print("\n");
                        System.out.println("1. Ruby-throated hummingbird");
                        System.out.println("2. Rufous hummingbird");
                        System.out.println("3. Anna's hummingbird");
                        System.out.println("4. Black-chinned hummingbird");
                        System.out.println("5. Broad-tailed hummingbird");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");
                        int hummingbird;
                        hummingbird = inputDevice.nextInt();
                        // Shows detail about the selected hummingbird specie
                        switch (hummingbird) {
                            case 1 -> System.out.println("The ruby-throated hummingbird is a species of hummingbird that " +
                                    "generally spends the winter in Central America, Mexico, and Florida, and " +
                                    "migrates to Eastern North America for the summer to breed. It is by far the " +
                                    "most common hummingbird seen east of the Mississippi River in North America.");
                            case 2 -> System.out.println("The rufous hummingbird is a small hummingbird, about 8 cm long " +
                                    "with a long, straight and slender bill. These birds are known for their " +
                                    "extraordinary flight skills, flying 2,000 mi during their migratory " +
                                    "transits. It is one of seven species in the genus Selasphorus.");
                            case 3 -> System.out.println("Anna's hummingbird, a medium-sized hummingbird native to the " +
                                    "west coast of North America, was named after Anna Masséna, Duchess of " +
                                    "Rivoli. In the early 20th century, Anna's hummingbirds bred only in " +
                                    "northern Baja California and southern California.");
                            case 4 -> System.out.println("The black-chinned hummingbird is a small hummingbird occupying" +
                                    " a broad range of habitats. It is migratory, spending winter as far " +
                                    "south as Mexico.");
                            case 5 -> System.out.println("The broad-tailed hummingbird is a medium-sized hummingbird " +
                                    "species found in highland regions from western United States and " +
                                    "Western Canada to Mexico and Guatemala.");
                        }
                    }
                    // Asks user to select from a set of Penguin species
                    case 4 -> {
                        System.out.println("Penguin");
                        System.out.println("Choose your Favorite Penguin");
                        System.out.print("\n");
                        System.out.println("1. Emperor penguin");
                        System.out.println("2. Gentoo penguin");
                        System.out.println("3. Chinstrap penguin");
                        System.out.println("4. King penguin");
                        System.out.println("5. Macaroni penguin");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");
                        int penguin;
                        penguin = inputDevice.nextInt();
                        // Shows facts about the selected penguin specie
                        switch (penguin) {
                            case 1 -> System.out.println("The emperor penguin is the tallest and heaviest of all living " +
                                    "penguin species and is endemic to Antarctica. The male and female are" +
                                    " similar in plumage and size, reaching 122 cm in height and weighing " +
                                    "from 22 to 45 kg.");
                            case 2 -> System.out.println("The gentoo penguin is a penguin species in the genus" +
                                    " Pygoscelis, most closely related to the Adélie penguin and the chinstrap" +
                                    " penguin. The earliest scientific description was made in 1781 by Johann" +
                                    " Reinhold Forster with a type locality in the Falkland Islands.");
                            case 3 -> System.out.println("The chinstrap penguin is a species of penguin that inhabits a " +
                                    "variety of islands and shores in the Southern Pacific and the Antarctic" +
                                    " Oceans. Its name stems from the narrow black band under its head, " +
                                    "which makes it appear as if it were wearing a black helmet, making it" +
                                    " easy to identify.");
                            case 4 -> System.out.println("The king penguin is the second largest species of penguin," +
                                    " smaller, but somewhat similar in appearance to the emperor penguin." +
                                    " There are two subspecies: A. p. patagonicus and A. p. halli; patagonicus" +
                                    " is found in the South Atlantic and halli in the South Indian Ocean " +
                                    "and at Macquarie Island.");
                            case 5 -> System.out.println("The macaroni penguin is a species of penguin found from the " +
                                    "Subantarctic to the Antarctic Peninsula. One of six species of crested " +
                                    "penguin, it is very closely related to the royal penguin, and some " +
                                    "authorities consider the two to be a single species.");
                        }
                    }
                    // Asks user to select from a set of swallow species
                    case 5 -> {
                        System.out.println("Swallow");
                        System.out.println("Choose your Favorite Swallow");
                        System.out.print("\n");
                        System.out.println("1. Barn swallow");
                        System.out.println("2. American cliff swallow");
                        System.out.println("3. Tree swallow");
                        System.out.println("4. Sand martin");
                        System.out.println("5. Violet-green swallow");
                        System.out.print("\n");
                        System.out.print("Type your choice here: ");
                        int swallow;
                        swallow = inputDevice.nextInt();
                        // Shows facts about the selected swallow specie
                        switch (swallow) {
                            case 1 -> System.out.println("The barn swallow is the most widespread species of swallow" +
                                    " in the world. It is a distinctive passerine bird with blue upperparts " +
                                    "and a long, deeply forked tail. It is found in Europe, Asia, Africa and" +
                                    " the Americas.");
                            case 2 -> System.out.println("The American cliff swallow is a member of the passerine bird " +
                                    "family Hirundinidae, the swallows and martins. The scientific name is " +
                                    "derived from Ancient Greek; Petrochelidon originates from the petros " +
                                    "meaning \"rock\" and khelidon \"swallow\", pyrrhonota comes from purrhos " +
                                    "meaning \"flame-coloured\" and -notos \"-backed\".");
                            case 3 -> System.out.println("The tree swallow is a migratory bird of the family " +
                                    "Hirundinidae. Found in the Americas, the tree swallow was first " +
                                    "described in 1807 by French ornithologist Louis Vieillot as Hirundo " +
                                    "bicolor. It has since been moved to its current genus, Tachycineta, within" +
                                    " which its phylogenetic placement is debated.");
                            case 4 -> System.out.println("The sand martin or European sand martin, bank swallow in the" +
                                    " Americas, and collared sand martin in the Indian Subcontinent, is a " +
                                    "migratory passerine bird in the swallow family.");
                            case 5 -> System.out.println("The violet-green swallow is a small North American passerine " +
                                    "bird in the swallow family. These aerial insectivores are distributed" +
                                    " along the west coast from Alaska to Mexico, extending as far east as " +
                                    "Montana and Texas.");
                        }
                    }
                }
            }
            // Asks the user to input a valid number if he types an invalid number
            default -> {
                System.out.println("Please choose a valid number!");
                main(args);
            }
        }
    }
}

