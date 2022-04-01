# Why we chose repository
>Minecraft can be viewed as a massive repository in the modding community. You are allowed to modify the game with anything you can code up.
>Using a repository allows everyone to constantly have access to all the source code for our mod. 
>For our team, we need everyone to have access to all our available code and to be able to add more code. 
>For example, if Isaac designed another block texture, he is instantly able to fetch the source code and add it to the game himself.
>Julian makes progress towards creating a functional game, and applies it to the previously edited repository. 

# Why we didn’t use another
> ## Pipe-and-Filter:
> - Not enough of us can act as filters
> - There would be too much redundancy in roles

> ## Peer-to-peer
> - There are too many components that everyone needs to be able to view.

> ## Publish-Subscribe
> - Would require one of us to publish code, and the rest of us to be useless until then. 

# Repository Diagram
![Repository Diagram](/IncomeGenerators/gh-pages/repo.png)

# In conclusion
> The repository architecture is perfect for our needs due to the following:
> 1. It allows code to easily be transferred from one end to another.
> 2. Minecraft itself is a massive repository, thus modifying the game through this method is much more easier to do.

> There are some faults to this method as:
> **1. ** If one member didn’t follow the correct steps in the coding process, running the test server would be impossible.
> **2. ** If a member doesn't post prerequisite code, such as a block, then there is no way to test the game functionality properly.
