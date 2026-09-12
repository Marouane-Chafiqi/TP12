# TP12

# Exercice 1 - Lecture de fichier texte (FileReader / BufferedReader)

- On lit un fichier texte ligne par ligne et on affiche son contenu dans la console.
- Un FileReader ouvre le fichier et fournit un flux brut de caractères. Ce flux est ensuite enveloppé dans un BufferedReader, qui ajoute un tampon en mémoire pour lire des lignes complètes d'un coup au lieu de lire caractère par caractère, ce qui rend la lecture beaucoup plus rapide.
- La lecture se fait dans une boucle qui appelle readLine() tant que la méthode ne renvoie pas null. Quand null apparaît, cela signale qu'on a atteint la fin du fichier.
- Le tout est placé dans un bloc try-with-resources, qui garantit que le flux sera fermé automatiquement dès la sortie du bloc, que tout se soit bien passé ou qu'une erreur soit survenue. Cela évite les fuites de ressources liées à des fichiers restés ouverts.

<img width="1280" height="666" alt="1" src="https://github.com/user-attachments/assets/b41176c0-0da3-47a3-8b6f-5320764d908b" />

https://github.com/user-attachments/assets/237356cd-4668-492a-a19b-ec000a241468


# Exercice 2 - Écriture avec PrintWriter et combinaison avec BufferedReader

- Cet exercice explore l'écriture de fichiers avec PrintWriter, une classe qui offre des méthodes simples comme print, println ou printf pour écrire du texte formaté directement dans un fichier.
- Le premier cas d'usage est un système de journalisation : chaque appel ajoute une ligne horodatée dans un fichier de log. Le fichier est ouvert en mode ajout (append) plutôt qu'en mode écrasement, ce qui permet d'accumuler les messages au fil du temps sans perdre l'historique précédent.
- Le deuxième cas d'usage génère un fichier CSV à partir d'une liste de données : une ligne d'en-tête suivie d'une ligne par élément, les valeurs étant séparées par des virgules.
- Le troisième cas d'usage produit une page HTML simple, en écrivant directement les balises ligne par ligne avec PrintWriter, ce qui montre que cette classe peut servir à générer n'importe quel type de contenu texte, pas seulement de simples messages.
- Dans les trois cas, le bloc try-with-resources referme automatiquement le flux d'écriture une fois terminé, garantissant que le contenu est bien sauvegardé sur le disque.

<img width="1280" height="669" alt="2" src="https://github.com/user-attachments/assets/5eca32e4-466f-4eb7-8b84-5936fc43e270" />

<img width="1280" height="669" alt="21" src="https://github.com/user-attachments/assets/2f0eb066-ac32-4be4-aaba-a70d5abbcfaa" />

<img width="1280" height="664" alt="22" src="https://github.com/user-attachments/assets/d25f72ca-62b4-4b01-8278-b5ecb35b8e4b" />

https://github.com/user-attachments/assets/6b12d49c-8654-4714-9471-1dfee21f589d




