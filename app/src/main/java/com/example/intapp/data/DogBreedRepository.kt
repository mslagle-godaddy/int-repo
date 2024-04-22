package com.example.intapp.data

import kotlinx.coroutines.delay

class DogBreedRepository {
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
                avgWeightInPounds = 100,
                avgHeightInInches = 26,
                avgLifeSpanInYears = 12,
                imgUrl = "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/06154034/Akita-standing-outdoors-in-the-summer.jpg"
            ),
            DogBreed(
                name = "American Bulldog",
                avgWeightInPounds = 85,
                avgHeightInInches = 23,
                avgLifeSpanInYears = 11,
                imgUrl = "https://www.akc.org/wp-content/uploads/2020/01/American-Bulldog-standing-in-three-quarter-view.jpg"
            ),
            DogBreed(
                name = "Labrador Retriever",
                avgWeightInPounds = 73,
                avgHeightInInches = 22,
                avgLifeSpanInYears = 12,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Labrador-Retrievers-three-colors.jpg"
            ),
            DogBreed(
                name = "German Pinscher",
                avgWeightInPounds = 35,
                avgHeightInInches = 19,
                avgLifeSpanInYears = 13,
                imgUrl = "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/20183655/German-Pinscher-standing-near-a-lake.jpg"
            ),
            DogBreed(
                name = "Greyhound",
                avgWeightInPounds = 65,
                avgHeightInInches = 28,
                avgLifeSpanInYears = 12,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Greyhound-running.jpg"
            ),
            DogBreed(
                name = "Whippet",
                avgWeightInPounds = 35,
                avgHeightInInches = 21,
                avgLifeSpanInYears = 13,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Whippet-On-White-01.jpg"
            ),
            DogBreed(
                name = "Wirehaired Pointing Griffon",
                avgWeightInPounds = 60,
                avgHeightInInches = 22,
                avgLifeSpanInYears = 13,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Wirehaired-Pointing-Griffon-laying-in-a-field.jpg"
            ),
            DogBreed(
                name = "Russell Terrier",
                avgWeightInPounds = 12,
                avgHeightInInches = 11,
                avgLifeSpanInYears = 13,
                imgUrl = "https://www.akc.org/wp-content/uploads/2017/11/Russell-Terrier-On-White-03.jpg"
            )
        )
    }
}