android-empty-project
=====================

The minimum to get started on an Android project (automated tests included).

Usage
-----

Choose a name (e.g., 'Nice-project-name').

Clone the repo.

    git clone URL Nice-project-name

Update the project name project.

    find . -type f ! -name README.md -exec sed --in-place -e 's/PROJECT_NAME/Nice-project-name/g' {} +
