# MK_A02_UF3

## Millores i preguntes de reflexió

1. **Afegiu un endpoint que cerqui per un camp de tipus String on feu servir regex.**
   En aquest cas hem afegit un buscador per primer cognom utilitzant regex, així es veo l'endpoint al swagger:
   ![image](https://github.com/user-attachments/assets/74787df8-f34c-4a5a-8c8d-9d59c6b42919)

2. **Què caracteritza una api reactiva com aquesta i què la fa diferent d’una api síncrona amb MVC com les treballades anteriorment?**
   Una API reactiva és asíncrona i no blocant, gestionant moltes peticions amb pocs recursos mitjançant tipus com `Mono` i `Flux`. A diferència de l’API síncrona amb MVC, que és blocant i usa un fil per petició, la reactiva és més escalable, eficient i està orientada a fluxos de dades amb suport per control de flux i errors dins del mateix flux.

3. **Què signifiquen Mono i Flux? Per a què penseu que serveixen i per què són útils en aquest tipus de programació?**
   Mono i Flux són tipus reactius de Project Reactor:

   Mono representa 0 o 1 element.

   Flux representa 0 o molts elements (un flux de dades).

   Serveixen per treballar amb dades de forma asíncrona i no blocant, permetent que les operacions (com consultes a BD o crides HTTP) s’executin sense aturar el fil principal.
   Són útils perquè permeten gestionar millor els recursos, millorar el rendiment i escalar fàcilment aplicacions amb moltes peticions concurrents.

4. **Què és record? Un record utilitza getters i setters? Justifiqueu la resposta**
   Un record en Java és un tipus especial de classe que serveix per representar dades immutables de forma concisa. Es declara amb la paraula clau record i, per defecte, no utilitza setters, només getters automàtics.

   **Justificació:**
   -  Els atributs són finals (no es poden modificar després de crear l’objecte).

   - Java genera automàticament els getters, el constructor, equals(), hashCode() i toString().

   - No hi ha setters, perquè l’objectiu és garantir immutabilitat.
