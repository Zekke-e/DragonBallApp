package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero


const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"
class HeroRepositoryImpl: HeroRepository {
        override val heroes: Map<Int, List<Hero>> by lazy {
            mapOf(
                1 to page1,
                2 to page2,
                3 to page3,
                4 to page4,
            )
        }

        override val page1 = listOf(
            Hero(
                id = 1,
                name = "Goku",
                image = "/images/goku.jpg",
                about = " Goku (孫そん悟空ごくう Son Gokū), born Kakarot (カカロット Kakarotto), is a Saiyan raised on Earth and the overall main protagonist of the Dragon Ball series.",
                rating = 5.0,
                power = 98,
                month = "July",
                day = "23rd",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Super Saiyan Transformations",
                    "Super Kamehameha",
                    "Super Dragon Fist"
                )
            ),
            Hero(
                id = 2,
                name = "Vegeta",
                image = "/images/vegeta.jpg",
                about = "Vegeta is the Prince of an extraterrestrial race of warriors known as the Saiyans just like the series' protagonist, Goku. Vegeta is extremely vain and proud, constantly referring to his heritage throughout the series. He believes he should be regarded as the strongest fighter in the Universe and becomes obsessed with surpassing Goku after fighting him. After his loss to Goku and the Z fighters, Vegeta later reluctantly unites with the heroes to thwart greater threats to the universe. Throughout the series, Vegeta's role changes from villain to antihero and later as one of the heroes, while remaining a rival to Goku. Vegeta's character, particularly his personality, has been well received. He is one of the Dragon Ball franchise's most popular characters.",
                rating = 5.0,
                power = 98,
                month = "Oct",
                day = "10th",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Super Saiyan Transformations",
                    "Final Flash",
                    "Big Bang Attack"
                )
            ),
            Hero(
                id = 3,
                name = "Gohan",
                image = "/images/gohan.jpg",
                about = "Gohan is a fictional character in the Dragon Ball manga series, created by Akira Toriyama. Gohan is introduced as the first son of the protagonist Goku, and his wife Chi-Chi, in chapter #196 Kakarrot, first published in Weekly Shōnen Jump magazine on October 8, 1988. Chi-Chi is a strict and protective mother to Gohan, forcing him to focus on his studies and forbidding him from practicing martial arts. However, due to the various threats to the Earth, she reluctantly allows him to fight, with him ultimately becoming one of the strongest characters in the series. Gohan has been well received by both fans and critics, the latter usually citing the character's growth from his initial appearance to his defeat of Cell.",
                rating = 4.5,
                power = 92,
                month = "Mar",
                day = "28th",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Super Saiyan Transformations",
                    "Super Kamehameha",
                    "Masenko"
                )
            )
        )
        override val page2 = listOf(
            Hero(
                id = 4,
                name = "Trunks",
                image = "/images/trunks.png",
                about = "Trunks has his grandfather's lavender hair color (blue in the manga) and his mother's blue eyes. He has his father's eye shape, facial features and tanned skin and his hair turns blond and eyes turn (pupil-less) green when he becomes a Super Saiyan. Several characters, such as Goku, Krillin and Bulma, remark how much Trunks resembles Vegeta. For the majority of the Buu Saga, Present Trunks wears a dark green gi, an orange belt, orange wristbands and the same golden boots that Future Trunks wears, he also wears this in the movie, Bio-Broly. In the events of Broly - Second Coming, Trunks wears a light green long sleeve hoodie with a black short sleeve undershirt with a red collar, indigo blue denim shorts and his golden boots from his primary outfit. He later wears Maloja's necklace. In Dragon Ball Z: Battle of Gods, Trunks wears overalls and a blue undershirt with maroon wristbands. At the end of Dragon Ball Z, Trunks now wears a black long-sleeved shirt, a golden vest, dark gray pants and the same golden boots that he wore as a child. Later he wears a black sleeveless muscle shirt with a CAPSULE logo at the center of his shirt, gray pants and his boots from his childhood.",
                rating = 4.9,
                power = 95,
                month = "Mar",
                day = "27th",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Super Saiyan Transformations",
                    "Galic Gun",
                    "Finish Buster"
                )
            ),
            Hero(
                id = 5,
                name = "Frieza",
                image = "/images/frieza.jpg",
                about = "Frieza, romanized as Freeza in Japanese merchandise, Funimation's English subtitles and Viz Media's release of the manga, is a fictional character in the Dragon Ball manga series created by Akira Toriyama. Frieza makes his debut in Chapter #247: Dark Clouds Swirl Over Planet Namek, first published in Weekly Shōnen Jump magazine on October 6, 1989, as a galactic tyrant feared as the most powerful being in the universe. Despite not appearing until the manga's second half, Frieza is considered to be the most iconic antagonist from the Dragon Ball franchise due to effectively serving as the catalyst of many of the events depicted in the story, such as Goku's arrival on Earth, the Saiyans landing on Earth, and subsequently the main characters going to planet Namek. In his appearances in the manga itself, he is also directly responsible for the murder of Goku's father Bardock, the genocide of the Saiyan race, the death of Vegeta, and the second death of Goku's best friend Krillin, arguably making him Goku's most personal and significant enemy, and the final confrontation between Goku and Frieza has been hailed as one of the most memorable manga and anime battles ever.",
                rating = 4.9,
                power = 95,
                month = "Mar",
                day = "31st",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Eye Laser",
                    "Death Beam",
                    "Death Ball"
                )
            ),
            Hero(
                id = 6,
                name = "Cell",
                image = "/images/cell.jpg",
                about = "Cell is the ultimate creation of Dr. Gero, who came from a future timeline, designed to possess all the abilities of the greatest fighters to have ever inhabited or visited Earth; the result was a perfect warrior, possessing numerous favorable genetic traits and special abilities. He was one of the few Red Ribbon Androids not directly completed by Dr. Gero; he was completed by Dr. Gero's Supercomputer. He is the main antagonist of the Imperfect Cell, Perfect Cell, and Cell Games Sagas.",
                rating = 4.9,
                power = 95,
                month = "Jul",
                day = "25th",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Energy Shield",
                    "Super Kamehameha",
                    "Destructo Disk"
                )
            )
        )
        override val page3 = listOf(
            Hero(
                id = 7,
                name = "Buu",
                image = "/images/buu.jpg",
                about = "Majin Buu, generally spelled Majin Boo in subtitles of the Japanese anime, and rendered as Djinn-Boo in the Viz Media manga, is a fictional character and the final antagonist in the Dragon Ball manga series created by Akira Toriyama. He is introduced in chapter #460 Majin Boo Appears?! Majin Bū Shutsugen ka!?) first published in Weekly Shōnen Jump magazine on March 1, 1994. Majin Buu is a genie-like magical life form created by the evil warlock Bibidi that terrorized galaxies by destroying entire planets, millions of years before the events of Dragon Ball take place. He was temporarily sealed away and brought to Earth; however, Bibbidi was killed and Buu remained hidden. During the events of Dragon Ball, he is revived by Bibidi's son Babidi in order to carry on his father's plan to conquer the entire universe.",
                rating = 4.2,
                power = 92,
                month = "Jan",
                day = "1st",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Absorption",
                    "Healing",
                    "Chocolate Beam"
                )
            ),
            Hero(
                id = 8,
                name = "Beerus",
                image = "/images/beerus.jpg",
                about = "Beerus, the God of Destruction is a character in the Dragon Ball franchise created by Akira Toriyama. Beerus made his first appearance in the 2013 feature film Dragon Ball Z: Battle of Gods as the main antagonist and returned as a supporting character in Dragon Ball Z: Resurrection 'F', as well as one of the main characters in Dragon Ball Super. He is a purple sphynx cat-like god seen wearing traditional Egyptian clothing and ornaments, whose occupation is to maintain balance by destroying planets, in contrast to the Kaiō-shin who create and preserve them. It had been stated that Beerus is a star buster by Whis. Often seen destroying planets at a whim, Beerus' two sole desires are, being quite a gourmet, enjoying the Universe's finest cooking and fighting opponents whom he considers to be worthy. The latter ultimately leads him to look for the Super Saiyan God who turns out to be one of the Saiyans now living on Earth. Eventually, Son Goku, with the help of other Saiyans, transforms into the Super Saiyan God and fights Beerus, just to be defeated by the God of Destruction. Having enjoyed the match, Beerus spares both Goku and the Earth, saying that Goku was the second strongest opponent he ever faced; first being his caretaker and martial arts teacher, Whis.",
                rating = 4.5,
                power = 97,
                month = "Oct",
                day = "27th",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Destruction Sphere",
                    "Destruction Gods, Fierce Attack",
                    "Hakai"
                )
            ),
            Hero(
                id = 9,
                name = "Piccolo",
                image = "/images/piccolo.png",
                about = "Piccolo Jr., usually just called Piccolo also known as Ma Junior, is a Namekian and also the final child and reincarnation of the Demon King Piccolo, later becoming the reunification of the Nameless Namekian after fusing with Kami. According to Grand Elder Guru, Piccolo, along with Kami and King Piccolo, are part of the Dragon Clan, who were the original creators of the Dragon Balls. A wise and cunning warrior who was originally a ruthless enemy of Goku, Piccolo later becomes a permanent member of the Dragon Team, largely due to forming a mutual respect to Goku and even more from forming a close bond with Goku's first-born son Gohan.",
                rating = 4.5,
                power = 96,
                month = "Sep",
                day = "15th",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Special Beam Cannon",
                    "Tri-Form",
                    "Light Grenade"
                )
            )
        )
        override val page4 = listOf(
            Hero(
                id = 10,
                name = "Gotenks",
                image = "/images/gotenks.jpg",
                about = "Gotenks, previously known as Trunkten, is the immensely powerful result of Trunks and Goten successfully using the Fusion Dance, and the first successful fusion dance character to be seen in the Dragon Ball series. He likes to call himself, The Hero of Justice or Grim Reaper of Justice.",
                rating = 5.0,
                power = 100,
                month = "Jan",
                day = "1st",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Super Saiyan Transformations",
                    "Galactic Donut",
                    "Super Ghost Kamikaze Attack"
                )
            ),
            Hero(
                id = 11,
                name = "Hit",
                image = "/images/hit.jpg",
                about = "Hit, renowned as Never-Miss Hit  and as the Legendary Hitman is the legendary assassin of Universe 6. In addition he also later on becomes the leader for Team Universe 6. Hit shows little emotion, likes to challenge himself, and is honorable.",
                rating = 3.9,
                power = 98,
                month = "Jan",
                day = "1st",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Time Skip",
                    "Death Blow",
                    "Vital Point Attack"
                )
            ),
            Hero(
                id = 12,
                name = "Krillin",
                image = "/images/krillin.jpg",
                about = "Krillin, is a supporting protagonist in the Dragon Ball manga, and the anime series Dragon Ball, Dragon Ball Z, Dragon Ball GT and Dragon Ball Super. Krillin had a brief rivalry with Goku when they first met and trained under Master Roshi, but they quickly became lifelong best friends. One of the most powerful and talented martial artists on Earth, Krillin is courageous, a faithful ally and good-natured. He is a prominent Z Fighter, despite usually being overpowered by the major enemies. His short stature and baldness (with the exception of when he grows out his hair in the Majin Buu Saga onwards) aid him in his ability to provide comic relief during tense moments. During the latter half of Dragon Ball Z, he largely retires from fighting, opting to settle down with his family instead, becoming the husband of Android 18 and the father of Marron. However, he returns to his lifestyle as a warrior later on in Dragon Ball Super.",
                rating = 3.4,
                power = 95,
                month = "Jan",
                day = "1st",
                family = listOf(
                    "Bardok",
                    "Gine",
                    "Raditz",
                    "Chi-Chi",
                    "Gohan"
                ),
                abilities = listOf(
                    "Kamehameha Wave",
                    "Destrcuto Disk",
                    "Solar Flare"
                )
            )
        )

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!
        )
    }

    private fun calculatePage(page: Int):Map<String,Int?>{
        var prevPage:Int? = page
        var nextPage:Int? = page
        if(page in 1 .. 3){
            nextPage = nextPage?.plus(1)
        }
        if(page in 2 ..4){
            prevPage = prevPage?.minus(1)
        }
        if(page == 1){
            prevPage = null
        }
        if(page == 4){
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
     return ApiResponse(
         success = true,
         message = "ok",
         heroes = findHeroes(query = name)
     )
    }
    private fun findHeroes(query: String?): List<Hero>{
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()){
            heroes.forEach{(_,heroes)->
                heroes.forEach { hero ->
                    if(hero.name.lowercase().contains(query.lowercase())){
                        founded.add(hero)
                    }
                }
            }
            founded
        }else{
            emptyList()
        }
    }
}