# Ontología para Gestión Colaborativa de Proyectos de Software [![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0) [![](https://jitpack.io/v/PedroJSanchez/OntoGestionProyectos.svg)](https://jitpack.io/#PedroJSanchez/OntoGestionProyectos)
 
## 1. Análisis de la Ontología 

La ontología para el sistema multiagente de gestión colaborativa de proyectos de software debe representar adecuadamente la información intercambiada entre los cuatro tipos de agentes principales (Coordinador, Tarea, Recursos y Decisión), permitiéndoles coordinarse para optimizar recursos y cumplir con los plazos de entrega.

### 1.1 Preguntas de competencia

1.  ¿Cómo identificar y clasificar los diferentes tipos de agentes en el sistema?
2.  ¿Cómo representar los proyectos, sus fases y estados actuales?
3.  ¿Cómo representar las tareas, sus dependencias, estados y requerimientos técnicos?
4.  ¿Cómo representar los recursos disponibles, su estado y asignación?
5.  ¿Cómo gestionar las propuestas de nuevos proyectos?
6.  ¿Cómo solicitar y asignar recursos necesarios para las tareas?
7.  ¿Cómo asignar tareas a los equipos de desarrollo según sus capacidades?
8.  ¿Cómo consultar el estado actual de proyectos y tareas?
9.  ¿Cómo formar coaliciones entre equipos para resolver problemas específicos?
10.  ¿Cómo monitorear proyectos y recibir actualizaciones periódicas?
11.  ¿Cómo representar las prioridades del negocio para la toma de decisiones?
12.  ¿Cómo gestionar conflictos en la asignación de recursos limitados?

Para resolver estas preguntas, se requiere el intercambio de información estructurada entre los agentes. A continuación, se presentan los diagramas AUML para la secuencia de mensajes que deben intercambiarse.

## 2. Diseño de la Ontología

### 2.1 Estructura de la Ontología

La ontología se implementará como una especialización de la clase `BeanOntology` de la biblioteca Jade, organizando los elementos en tres categorías principales:

-   **Concept**: Elementos que representan la información necesaria para el intercambio entre agentes.
-   **AgentAction**: Elementos para el contenido de los mensajes en el inicio de los protocolos.
-   **Predicate**: Elementos que forman el contenido de las respuestas en los protocolos.

El diseño de la ontología incluirá la siguiente estructura de paquetes:

-   `es.ujaen.ssmmaa.onto`: paquete principal de la ontología
    -   `OntoGestionProyectos`: clase que representa la ontología basada en BeanOntology.
    -   `Vocabulario`: interface Java donde se encuentran los elementos de vocabulario utilizados.
-   `es.ujaen.ssmmaa.onto.elementos`: paquete con los elementos de la ontología
    -   Conceptos fundamentales
    -   Actions para iniciar los protocolos
    -   Predicados para las respuestas

### 2.2 Registro en las páginas amarillas

Todos los agentes deberán realizar el registro en las páginas amarillas siguiendo las siguientes indicaciones:

 - El tipo de servicio será para todos los agentes el mismo, `TIPO_SERVICIO`, que se encuentra definido en el vocabulario de la ontología.
 - En nombre del servicio corresponderá al nombre del enumerado, `NombreServicio`, según el agente que se esté registrando en las páginas amarillas. El enumerado también forma parte del vocabulario de la ontología.

## 3. Protocolos de Comunicación

A continuación, se detallan los protocolos de comunicación entre los agentes. En los diagramas se muestran el intercambio de información entre los agentes. En el protocolo se define los elementos de ontología que deberá integrar como parte del contenido de los mensajes. El mensaje inicial será un `AgentAction` y las respuestas son `Predicates`. Para poder componer estos elementos también será necesario definir los `Concept` que formarán parte de cada uno de ellos.

### 3.1 Protocolo FIPA-Propose: Propuesta de Proyectos

```mermaid
sequenceDiagram
    participant AD as Agente Decisión
    participant AC as Agente Coordinador
    
    Note over AD, AC: Protocolo FIPA-Propose para nuevos proyectos
    
    AD->>AC: PROPOSE<br/>Contenido: ProponerProyecto
    
    alt Proyecto viable
        AC-->>AD: ACCEPT-PROPOSAL<br/>Contenido: AceptacionProyecto
    else Proyecto no viable
        AC-->>AD: REJECT-PROPOSAL<br/>Contenido: RechazoProyecto
    end

```

### 3.2 Protocolo FIPA-Request: Asignación de Recursos

```mermaid
sequenceDiagram
    participant AD as Agente Decisión
    participant AR as Agente Recursos
    
    Note over AD, AR: Protocolo FIPA-Request para asignación de recursos
    
    AD->>AR: REQUEST<br/>Contenido: AsignarRecursos
    
    alt Asignación viable
        AR-->>AD: AGREE<br/>Contenido: AceptacionPreliminar
        
        alt Asignación exitosa
            AR->>AD: INFORM<br/>Contenido: AceptacionAsignacionRecursos
        else Fallo en la asignación
            AR->>AD: FAILURE<br/>Contenido: ErrorAsignacion
        end
        
    else Asignación no viable
        AR-->>AD: REFUSE<br/>Contenido: RechazoAsignacionRecursos
    end

```

### 3.3 Protocolo FIPA-Request: Solicitud de Recursos

```mermaid
sequenceDiagram
    participant AT as Agente Tarea
    participant AR as Agente Recursos
    
    Note over AT, AR: Protocolo FIPA-Request para solicitud de recursos
    
    AT->>AR: REQUEST<br/>Contenido: SolicitarRecursos
    
    alt Solicitud viable
        AR-->>AT: AGREE<br/>Contenido: AceptacionPreliminar
        
        alt Asignación exitosa
            AR->>AT: INFORM<br/>Contenido: RecursoAsignado
        else Fallo en la asignación
            AR->>AT: FAILURE<br/>Contenido: ErrorAsignacion
        end
        
    else Solicitud no viable
        AR-->>AT: REFUSE<br/>Contenido: RechazoAsignacionRecursos
    end

```

### 3.4 Protocolo FIPA-Propose: Asignación de Tareas

```mermaid
sequenceDiagram
    participant AC as Agente Coordinador
    participant AT as Agente Tarea
    
    Note over AC, AT: Protocolo FIPA-Propose para asignación de tareas
    
    AC->>AT: PROPOSE<br/>Contenido: AsignarTarea
    
    alt Tarea aceptada
        AT-->>AC: ACCEPT-PROPOSAL<br/>Contenido: AceptacionTarea
    else Tarea rechazada
        AT-->>AC: REJECT-PROPOSAL<br/>Contenido: RechazoTarea
    end

```

### 3.5 Protocolo para Consulta de Estados (adaptación FIPA-Request)

```mermaid
sequenceDiagram
    participant AC as Agente Coordinador
    participant AT as Agente Tarea
    
    Note over AC, AT: Protocolo FIPA-Request para consulta de estados
    
    AC->>AT: REQUEST<br/>Contenido: ConsultarEstado
    
    alt Información disponible
        AT-->>AC: INFORM<br/>Contenido: InfoEstadoTarea
    else Información no disponible
        AT-->>AC: REFUSE<br/>Contenido: RechazoConsulta
    end

```

### 3.6 Protocolo FIPA-Contract-Net: Formación de Coaliciones

```mermaid
sequenceDiagram
    participant AC as Agente Coordinador
    participant AT1 as Agente Tarea 1
    participant AT2 as Agente Tarea 2
    participant AR as Agente Recursos
    participant AD as Agente Decisión

    Note over AC, AD: Protocolo FIPA-Contract-Net para formación de coaliciones

    AC->>AT1: CFP<br/>Contenido: ProponerCoalicion
    AC->>AT2: CFP<br/>Contenido: ProponerCoalicion
    AC->>AR: CFP<br/>Contenido: ProponerCoalicion
    AC->>AD: CFP<br/>Contenido: ProponerCoalicion

    alt AT1 puede participar
        AT1-->>AC: PROPOSE<br/>Contenido: RespuestaParticipacion
    else AT1 no puede participar
        AT1-->>AC: REFUSE<br/>Contenido: RechazoCoalicion
    end

    alt AT2 puede participar
        AT2-->>AC: PROPOSE<br/>Contenido: RespuestaParticipacion
    else AT2 no puede participar
        AT2-->>AC: REFUSE<br/>Contenido: RechazoCoalicion
    end

    alt Recursos disponibles
        AR-->>AC: PROPOSE<br/>Contenido: DisponibilidadRecursos
    else Recursos no disponibles
        AR-->>AC: REFUSE<br/>Contenido: RechazoAsignacion
    end

    alt Aprueba la coalición
        AD-->>AC: PROPOSE<br/>Contenido: AprobacionCoalicion
    else Rechaza la coalición
        AD-->>AC: REFUSE<br/>Contenido: RechazoCoalicion
    end

    alt Todas las propuestas aceptadas
        AC->>AT1: ACCEPT-PROPOSAL<br/>Contenido: ConfirmacionCoalicion
        AC->>AT2: ACCEPT-PROPOSAL<br/>Contenido: ConfirmacionCoalicion
        AC->>AR: ACCEPT-PROPOSAL<br/>Contenido: ConfirmacionCoalicion
        AC->>AD: ACCEPT-PROPOSAL<br/>Contenido: ConfirmacionCoalicion

        AT1-->>AC: INFORM<br/>Contenido: ConfirmacionParticipacion
        AT2-->>AC: INFORM<br/>Contenido: ConfirmacionParticipacion
        AR-->>AC: INFORM<br/>Contenido: ReservaRecursosConfirmada
        AD-->>AC: INFORM<br/>Contenido: RegistroCoalicionConfirmado

    else Una o más propuestas rechazadas
        alt AT1 envió PROPOSE
            AC->>AT1: REJECT-PROPOSAL<br/>Contenido: CancelacionCoalicion
        end
        alt AT2 envió PROPOSE
            AC->>AT2: REJECT-PROPOSAL<br/>Contenido: CancelacionCoalicion
        end
        alt AR envió PROPOSE
            AC->>AR: REJECT-PROPOSAL<br/>Contenido: CancelacionCoalicion
        end
        alt AD envió PROPOSE
            AC->>AD: REJECT-PROPOSAL<br/>Contenido: CancelacionCoalicion
        end
    end

```

### 3.7 Protocolo FIPA-Subscribe: Monitoreo de Proyectos

```mermaid
sequenceDiagram
    participant AC as Agente Coordinador
    participant AT as Agente Tarea
    
    Note over AC, AT: Protocolo FIPA-Subscribe para monitoreo de proyectos
    
    AC->>AT: SUBSCRIBE<br/>Contenido: SuscribirMonitoreo
    
    alt Suscripción aceptada
        AT-->>AC: AGREE<br/>Contenido: AceptacionSuscripcion
        
        loop Mientras la suscripción esté activa
            alt Cambio de estado detectado
                AT->>AC: INFORM<br/>Contenido: ActualizacionEstadoProyecto
            end
        end
        
    else Suscripción rechazada
        AT-->>AC: REFUSE<br/>Contenido: RechazoSuscripcion
    end
    
    AC->>AT: CANCEL<br/>Contenido: CancelacionSuscripcion
    AT-->>AC: INFORM<br/>Contenido: ConfirmacionCancelacion

```

