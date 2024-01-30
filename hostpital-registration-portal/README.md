# Hospital Registration Portal

## Overview

This project is a command-line driven hospital registration portal implemented using Maven and the Spring framework. It allows users to register visits to the hospital, choose a doctor, and generate visit reports.


## Features

1. **Registration Command:**
    - Users can register their visits by providing their name, choosing a doctor, or visiting a patient without selecting a doctor.
    - Timestamps of visits are recorded.

2. **Report Command:**
    - Users can generate and view a report containing the list of visitors with their names, last names, and details about their visits (doctor or patient, timestamp).

3. **Dependency Injection:**
    - Spring framework is used for dependency injection, maintaining state, and acting as an interim database.

