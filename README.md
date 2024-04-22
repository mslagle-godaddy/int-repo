# Interview-App

## Goal
Following your personal best practices & preferences, implement a basic app that will render the dog breed data from the given repository into a scrollable list, handling the following scenarios:
- Data is fetched successfully from the given repository
  - Render list in alphabetical order by breed name
  - Display images alongside the information
- An error is encountered while fetching the data
  - Allow the user to retry
- Data is empty
  - Display a message to the user indicating there are no breeds to display

Once data is rendered, implement a basic search bar that will filter the list based on the user input against all fields of the data.

Unit test as much as possible given the time constraints.

## Notes
- The main focus should be on getting the data from the remote source, bringing it up through the viewmodel, and rendering it to the screen using the practices, preferences, and architecture you see as best. The UI is NOT the focus of this exercise, it should just be functional.
- You can use any libraries or frameworks you want
- You can use any design patterns you want
- You can change or extend any part of the initial codebase with the exception of the data fetching logic