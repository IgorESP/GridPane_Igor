# Mi Aplicación JavaFX

Proyecto ejemplo de **JavaFX** con interfaz en **FXML**, controladora en Java y Maven.

---

## Estructura

src/
├─ main/java/com/igoresparza/
│ ├─ App.java
│ └─ PrimaryController.java
├─ main/resources/
│ ├─ fxml/primary.fxml
│ └─ css/styles.css
pom.xml


---

## Funcionalidad

- **TextField:** ingresar texto.  
- **TextArea:** mostrar texto ingresado.  
- **Botones:**
  - **OK:** copia texto del TextField a TextArea.  
  - **Cancel:** borra ambos campos.  
- Layout responsivo: GridPane, botones se expanden con la ventana.  
- Labels “Name” y “Description” en negrita y tamaño mayor; label de Status sin afectar.

---

## CSS (`styles.css`)

```css
.root { -fx-background-color: lightgray; }
.vbox { -fx-padding: 10; }
.hbox { -fx-background-color: lavender; -fx-font-size: 7pt; -fx-padding: 10 0 0 0; }
.label.main-label { -fx-font-size: 14pt; -fx-font-weight: bold; }

Maven Javadoc Plugin
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-javadoc-plugin</artifactId>
  <version>3.11.2</version>
  <configuration>
    <source>23</source>
    <encoding>UTF-8</encoding>
    <show>protected</show>
    <doclint>none</doclint>
    <failOnError>false</failOnError>
  </configuration>
  <executions>
    <execution>
      <id>attach-javadocs</id>
      <goals><goal>jar</goal></goals>
    </execution>
  </executions>
</plugin>


Generar HTML: mvn javadoc:javadoc → target/site/apidocs/index.html.

Generar JAR: mvn javadoc:jar → target/*-javadoc.jar.

Ejecutar

Abrir en IntelliJ o IDE compatible con Maven.

Configurar Project SDK a Java 23.

Ejecutar App.java.
