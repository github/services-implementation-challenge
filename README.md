# services-implementation-challenge

## Instructions

This repository is a technical challenge for candidates applying to certain implementation engineering positions at GitHub.
The code is primarily written in Java, XML, and YAML. It uses the Apache Maven build system and the Ansible deployment tool.

If you are asked to complete this challenge as part of your application:

- Please clone this repository to your computer and then follow the steps below.
- For each step, make the suggested changes in your local checkout of the repository.
- Follow the instructions in the final step to submit your solution.

## Step 1: Build

The first part of this challenge is to build the frontend and backend services.

There is a build script (`code/build.sh`) which should build the files `frontend.war` and `backend.war` and place them in `$checkout/bin`, but it is currently broken. Fix the build.

You will need Java and Maven installed on your local machine and available on the PATH.

## Step 2: Deploy

Once you are able to build the frontend and backend projects, the next step is to deploy the built artifacts.

To get you started, there is an example Ansible playbook in `playbook.yml` and an Ansible hosts inventory in `inventory.yml`.

After [installing Ansible on your local machine](https://docs.ansible.com/ansible/latest/installation_guide/index.html), you can run the playbook with the following command. It may prompt you for the `sudo` password so that it can install Java on the host.
```
ansible-playbook playbook.yml -i inventory.yml -v --ask-become-pass
```

1. Modify the Ansible playbook to deploy the frontend and backend WAR files that you built in Step 1.
1. Modify the Ansible playbook to ensure the frontend can communicate with the backend. When this is successful, you should be able to see a response displayed at `localhost:8000/frontend`.
1. Set up two free virtual machine instances on a cloud platform of your choice.
1. Modify the Ansible inventory to use these VMs as your frontend and backend hosts, respectively.
1. Verify that your frontend and backend are successfully launched on the VMs, by visiting the deployed frontend in your browser.

## Step 3: Submit

1. After completing the above steps, your changes to the build and deployment scripts will be visible in your local checkout of this repository. Generate a diff of your changes and save them to a text file. You can do this by running the following command in a terminal from the root of your checkout:

        git diff origin/master > solution.diff

1. Upload the `solution.diff` file to your application in Greenhouse.
1. Upload a short writeup to your application in Greenhouse explaining the changes that you made in your solution.

Please make sure that all material you submit is your own work, or that you have appropriately cited the work of others used in your solution.

## License

This project is [licensed](LICENSE.md) under the MIT License.

When using the GitHub logos, be sure to follow the [GitHub logo guidelines](https://github.com/logos).