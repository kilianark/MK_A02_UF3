# MK_A02_UF3

Endpoint findAll:
![image](https://github.com/user-attachments/assets/be90db5c-1fa3-4f23-a59d-d4d3bb7ebd9b)

Ens retorna tots els students guardats a la nostra base de MongoDB.

Endpoint GetById:
![image](https://github.com/user-attachments/assets/5ac0f6c2-fe13-4b40-a430-bb6adad5e2f6)

Ens retorna el student per la seva id.

Endpoint LastName
![image](https://github.com/user-attachments/assets/a1eb99f0-84bb-4b60-b742-48b4223de7b2)

Ens retorna tots els students que contingui el que li passem al endpoint al path.

Endpoint Update:
![image](https://github.com/user-attachments/assets/fa5ce522-20e7-42ed-8231-66f6559bcde0)
![image](https://github.com/user-attachments/assets/b158a5e6-f0e9-4781-9bde-8dc2d9d8d391)
![image](https://github.com/user-attachments/assets/fe5f30b2-913c-4e42-98a9-117d56f57304)

Actualitza un student existent amb les dades que li pasem.

Endpoint Save:
![image](https://github.com/user-attachments/assets/11ba0238-d175-4c9f-9c74-d03f7a4b83b0)
![image](https://github.com/user-attachments/assets/6bf8e24a-aec9-4bbb-828a-c90b60307e94)

Crea el usuari amb les dades que li hem passat.

Endpoint Delete:

![image](https://github.com/user-attachments/assets/593eb37a-c226-4915-b8bc-3627e859f4f5)
![image](https://github.com/user-attachments/assets/f9376d2c-7485-442d-ad7a-1e096c807f8f)

Borra el usuari amb la ID

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
