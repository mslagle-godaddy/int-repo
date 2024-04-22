package com.example.intapp.data

import kotlinx.coroutines.delay

class DogBreedRemoteDataSource {
    suspend fun getDogBreeds() : Result<List<DogBreed>> {
        val isError = (1..5).random() == 1

        val networkDelay = (1L..1000L).random()
        delay(networkDelay)

        return if (isError) {
            Result.failure(Exception("An error occurred"))
        } else {
            Result.success(dogBreeds.shuffled())
        }
    }

    companion object {
        private val dogBreeds = listOf(
            DogBreed(
                name = "Akita",
                description = "Akitas are muscular, double-coated dogs of ancient Japanese lineage famous for their dignity, courage, and loyalty. In their native land, they are venerated as family protectors and symbols of good health, happiness, and long life.",
                avgWeightInPounds = 100,
                avgHeightInInches = 26,
                avgLifeSpanInYears = 12,
                imgUrl = "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/06154034/Akita-standing-outdoors-in-the-summer.jpg"
            ),
            DogBreed(
                name = "American Bulldog",
                description = "American Bulldogs are a well-balanced athletic dog that demonstrate great strength, endurance, agility, and a friendly attitude. Historically, they were bred to be a utility dog used for working the farm.",
                avgWeightInPounds = 85,
                avgHeightInInches = 23,
                avgLifeSpanInYears = 11,
                imgUrl = "https://www.akc.org/wp-content/uploads/2020/01/American-Bulldog-standing-in-three-quarter-view.jpg"
            ),
            DogBreed(
                name = "Labrador Retriever",
                description = "The sweet-faced, lovable Labrador Retriever is one of America's most popular dog breeds, year after year. Labs are friendly, outgoing, and high-spirited companions who have more than enough affection to go around for a family looking for a medium-to-large dog.",
                avgWeightInPounds = 73,
                avgHeightInInches = 22,
                avgLifeSpanInYears = 12,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Labrador-Retrievers-three-colors.jpg"
            ),
            DogBreed(
                name = "German Pinscher",
                description = "The sleek, no-frills German Pinscher is among Germany's oldest breeds and the prototype of other pinscher breeds. This energetic, super-intelligent dog was at first used as a rat catcher but can be trained for all types of canine work.",
                avgWeightInPounds = 35,
                avgHeightInInches = 19,
                avgLifeSpanInYears = 13,
                imgUrl = "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/20183655/German-Pinscher-standing-near-a-lake.jpg"
            ),
            DogBreed(
                name = "Greyhound",
                description = "The champion sprinter of dogdom, the Greyhound is a gentle, noble, and sweet-tempered companion with an independent spirit.",
                avgWeightInPounds = 65,
                avgHeightInInches = 28,
                avgLifeSpanInYears = 12,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Greyhound-running.jpg"
            ),
            DogBreed(
                name = "Whippet",
                description = "The sleek, sweet-faced Whippet, the 'Poor Man's Racehorse,' is lightning quick. He is an amiable, dignified, and gentle soul, but give him something to chase and he's all business.",
                avgWeightInPounds = 35,
                avgHeightInInches = 21,
                avgLifeSpanInYears = 13,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Whippet-On-White-01.jpg"
            ),
            DogBreed(
                name = "Wirehaired Pointing Griffon",
                description = "The hardworking Wirehaired Pointing Griffon, renowned as the 'supreme gundog,' is known for the harsh, low-shedding coat the breed is named for.",
                avgWeightInPounds = 60,
                avgHeightInInches = 22,
                avgLifeSpanInYears = 13,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Wirehaired-Pointing-Griffon-laying-in-a-field.jpg"
            ),
            DogBreed(
                name = "Russell Terrier",
                description = "Upbeat, lively, inquisitive, and friendly, the jaunty Russell Terrier was developed by England's 'Sporting Parson' for use in foxhunts.",
                avgWeightInPounds = 12,
                avgHeightInInches = 11,
                avgLifeSpanInYears = 13,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Russell-Terrier-On-White-03.jpg"
            )
        )
    }
}