# Travaux pratiques Java

## Quelques fonctions pour commencer

Tu as sous les yeux un projet vierge. Tu vas devoir coder des classes dans les parties suivantes. Mais comme je suis très étourdi, j'ai oublié de coder les fonctions qui vont permettre de tester que tout fonctionne bien! C'est donc à toi que revient la tâche (et surtout l'honneur) de coder ces quelques fonctions essentielles pour la suite! 💪

> _Note_: les solutions sont données en _spoiler_ pour éviter que tu sois bloqué pour la suite... Mais bien évidemment, le but est que tu essaies de les coder seul!

### 1. Une pincée d'égalité

Tout d'abord, il nous faudrait une fonction qui nous permette de tester si deux valeurs sont égales, ou non.

Dans le fichier **src/app/App.java**, tu dois coder une fonction **isEqual** qui répond aux spécifications suivantes:

- Elle doit faire partie de la classe **App**.
- Elle doit être **statique** et **privée**.
- **ENTREE**: deux nombres entiers.
- **SORTIE**: un booléen. Si les deux nombes fournis en entrée sont égaux, **true**. Sinon, **false**.

<details>
<summary>Solution</summary>
```java
private static boolean isEqual(Object value1, Object value2) {
    return value1 == value2;
}
```
</details>

### 2. Un soupçon de création d'objet

Ensuite, il nous faudrait une fonction qui nous crée un personnage (objet de type **Character**).

Dans le fichier **src/app/App.java**, tu dois coder une fonction **createCharacter** qui répond aux spécifications suivantes:

- Elle doit faire partie de la classe **App**.
- Elle doit être **statique** et **privée**.
- **ENTREE**: aucune.
- **SORTIE**: un objet de type **Character**.
- Elle doit afficher le message "Créons Mario avec 3 vies..."

<details>
<summary>Solution</summary>
```java
private static Character createCharacter() {
    System.out.println("Créons Mario avec 3 vies...");
    return new Character(3);
}
```
</details>

### 3. Une larme de retour utilisateur

Pour finir, il nous faudrait une fonction qui utilise tout ce que nous avons écrit jusqu'à maintenant pour afficher dans la console Java le résultat de nos appels.

Dans le fichier **src/app/App.java**, tu dois coder une fonction **test** qui répond aux spécifications suivantes:

- Elle doit faire partie de la classe **App**.
- Elle doit être **statique** et **privée**.
- **ENTREE**: une chaîne de caractère représentant l'appel effectué, un nombre entier représetant le résultat de cet appel, et un nombre entier représentant la valeur attendue.
- **SORTIE**: aucune.
- Si les deux valeurs sont égales, la fonction doit afficher: "L'appel  [...]  renvoie: [...]. (valeur attendue: [...]) C'est bon! ☑️", sinon: "L'appel  [...]  renvoie: [...]. (valeur attendue: [...])  Encore un coup des Illuminati... ❔".

<details>
<summary>Solution</summary>
```java
private static void test(String call, Object actualValue, Object expectedValue) {
    String message = "L'appel  " + call + "  renvoie: " + String.valueOf(actualValue) + ". (valeur attendue: " + expectedValue + ")  ";
    if (isEqual(actualValue, expectedValue)) {
        message += "C'est bon! ☑️";
    } else {
        message += "Encore un coup des Illuminati... ❔";
    }
    System.out.println(message);
}
```
</details>

## Et maintenant, rentrons dans le vif du sujet!

Nous allons coder la classe **Character** dans le fichier **src/app/Character.java** pour reproduire le comportemant de Mario, le célèbre personnage du jeu Super Mario Bros.

> A chaque étape, tu dois décommenter le code correspondant dans la méthode **App.main**, afin de tester le bon fonctionnement de ton code.

### 1. Dieu créa Mario

Notre classe **Character** doit avoir une propriété **lives** qui permet de stocker le nombre de vies de notre personnage.

Lorsque nous créons un nouvel objet de type **Character**, il faut que celui-ci commence avec 3 vies.

<details>
<summary>Indice</summary>
Tu peux utiliser un **constructeur** pour cela.
</details>

#### Bonus

Trouver 2 façons différentes de coder cette fonctionnalité.

### 2. C'est la vie

Nous avons maintenant besoin de pouvoir accéder à la propriété **lives** de notre personnage, et de pouvoir la manipuler.

Comme nous préférons que seul le personnage lui-même soit capable de modifier sa propre quantité de vies, passe la propriété **lives** en **privé**.

Tu dois ensuite coder les méthodes suivantes:

- **getLives**: renvoie le nombre de vies.
- **addLife**: ajoute une vie.
- **loseLife**: retire une vie.
- **hasLives**: permet de savoir si le personnage a encore au moins une vie.

<details>
<summary>Indice</summary>
Tu peux t'inspirer des tests pour déterminer le **type de retour** des fonctions.
</details>

#### Bonus

Lorsqu'on demande à notre personnage de perdre une vie, alors qu'il n'en a plus, afficher un message, ou lancer un message d'erreur.

### 3. Petit Mario deviendra grand

Comme tu le sais, Mario peut ramasser un champignon pour devenir grand. Tant qu'il est grand, il ne peut pas perdre de vie; s'il prend un coup, il redevient petit à la place.

Crée une propriété **privée** **isBig** qui permettra de savoir si notre personnage est grand ou non.

Tu dois ensuite coder les méthodes suivantes:

- **getIsBig**: renvoie la valeur de **isBig**.
- **pickUpMushroom**: permet à Mario de devenir grand.
- **takeHit**: si Mario est grand, il redevient petit. S'il était déjà petit, il perd une vie.

### 4. La tête dans les étoiles

Mario peut aussi ramasser une étoile pour devenir temporairement invulnérable. Tant que l'effet de l'étoile est actif, Mario ne peut ni redevenir petit (s'il était grand), ni perdre de vie.

Crée une propriété **privée** **isInvulnerable** qui permet de savoir si notre personnages est invulnérable ou non.

Tu dois ensuite coder les méthodes suivantes:

- **getIsInvulnerable**: renvoie la valeur de **isInvulnerable**.
- **pickUpStar**: permet à Mario de devenir invulnérable.
- **invulnerableWearsOff**: permet à l'effet de l'étoile de se dissiper.

<details>
<summary>Indice</summary>
Il faudra peut-être modifier une méthode de l'étape précédent pour obtenir le comportement attendu!
</details>

### 5. Vers l'infini et au-delà

Tu es encore chaud? Remémoire-toi la glorieuse époque des consoles 16 bits, et trouve d'autres idées de comportements (existants ou inventés) que tu pourrais implémenter pour rendre notre Mario encore plus complet!
