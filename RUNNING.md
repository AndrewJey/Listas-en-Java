

<!-- local-development:start -->
# Desarrollo local

Puedes abrir este repositorio en VS Code, Antigravity o Sublime Text. El compilador y los servicios necesarios dependen del componente indicado abajo.

## Java / NetBeans

En NetBeans 25, abre la carpeta que contiene `build.xml` como proyecto Ant. Selecciona un JDK igual o posterior al nivel de fuente del proyecto; las compilaciones de esta revisión usan JDK 24.0.2. El asistente busca NetBeans y el JDK y mantiene la configuración de usuario en `.local-build/`.

```powershell
..\build-local.ps1
.\build-local.ps1 -Project 'Listas_Simples/build.xml' -Target run
```

Si hay varios proyectos, elige el deseado con `-Project`. Puedes indicar `-JavaHome` y `-NetBeansHome`. `-Target test` ejecuta las pruebas que declare el proyecto; un objetivo de pruebas vacío no acredita cobertura.

## Componentes y validación

Inventario y compilaciones locales del 2026-11-15. Una compilación correcta no acredita todavía interacción, compatibilidad de base de datos, instalador ni despliegue.

| Componente | Tipo / destino | Validación |
| --- | --- | --- |
| [Listas_Simples/build.xml](<Listas_Simples/build.xml>) | netbeans-ant / 1.8 | Compila y pasa verificación funcional (`checks/`) |

## Archivos ignorados

`.gitignore` excluye credenciales locales, estado del editor y salidas de las herramientas detectadas. No deja de versionar archivos que ya estaban en Git. Los manifiestos, archivos de bloqueo, recursos fuente y scripts de esquema forman parte del código.
<!-- local-development:end -->

<!-- improvements-20261119:start -->
## Mejoras y verificación funcional (2026-11-19)

- **Mejoras aplicadas:** Corregido el mantenimiento de punteros `primero`/`fin` al insertar y eliminar en lista simple, lista doble (incluyendo nodo único y cabeza nueva sin predecesor) y lista circular simple.
- **Pruebas ejecutadas:** ListCheck (502 aserciones: inserciones, eliminaciones hasta vaciar y recorrido circular sin bucles rotos).
- **Definición de comprobaciones:** [`checks/projects.json`](checks/projects.json) (ejecutable tras compilar con `.\build-local.ps1`).
<!-- improvements-20261119:end -->
