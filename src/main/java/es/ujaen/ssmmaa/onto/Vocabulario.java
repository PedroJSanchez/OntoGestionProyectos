package es.ujaen.ssmmaa.onto;

import java.util.Arrays;
import java.util.List;

/**
 * Interfaz que define todas las constantes, enumerados y valores
 * necesarios para la comunicación entre agentes en el sistema
 * de gestión colaborativa de proyectos de software.
 */
public interface Vocabulario {

    /**
     * Nombre de la ontología para la gestión colaborativa de proyectos.
     */
    String ONTOLOGY_NAME = "Ontologia-Gestion-Proyectos";

    /**
     * Nombre del servicio para el registro en páginas amarillas.
     * Todos los agentes que formen parte del sistema de gestión de proyectos
     * deberán registrarse bajo este nombre de servicio.
     */
    String TIPO_SERVICIO = "Gestion-Proyectos-Software";

    /**
     * Enumerado que define los tipos de servicios generales que pueden
     * registrarse en las páginas amarillas. Este enumerado se usará en el
     * campo 'type' del ServiceDescription.
     */
    enum NombreServicio {
        // Tipos principales según la estructura del proyecto
        COORDINADOR,    // Servicios de coordinación y planificación
        DESARROLLO,     // Servicios de desarrollo y tareas
        RECURSOS,       // Servicios de gestión de recursos
        DECISION        // Servicios de validación y toma de decisiones
    }

    /**
     * Enumerado para definir los nombres de servicio asociados a los agentes de gestión
     * para los proyectos
     */
    enum Gestores {
        // Único servicio para Agente Coordinador
        COORDINACION_PROYECTO,

        // Único servicio para Agente de Recursos
        GESTION_RECURSOS,

        // Único servicio para Agente de Decisión
        TOMA_DECISIONES
    }

    /**
     * Enumerado que define las especialidades fundamentales de los equipos
     * de desarrollo de software. Proporciona una categorización balanceada
     * que facilita la asignación de tareas y la formación de coaliciones.
     */
    enum LineasDesarrollo {
        // Especialidades principales por área funcional
        FRONTEND,           // Interfaces de usuario, experiencia de usuario, interacción
        BACKEND,            // Lógica de servidor, APIs, procesamiento
        FULLSTACK,          // Combinación de habilidades frontend y backend
        MOBILE,             // Desarrollo para plataformas móviles (Android, iOS)
        DEVOPS,             // Infraestructura, CI/CD, automatización de despliegue
        QA,                 // Testing, aseguramiento de calidad, automatización

        // Especialidades técnicas transversales
        ARQUITECTURA,       // Diseño de sistemas, patrones, decisiones técnicas
        SEGURIDAD,          // Desarrollo seguro, ciberseguridad
        DATOS,              // Bases de datos, ingeniería de datos, análisis
        IA_ML,              // Inteligencia artificial, aprendizaje automático

        // Especialidades por dominio
        CLOUD,              // Soluciones basadas en la nube
        EMBEDDED_IOT,       // Sistemas embebidos e Internet de las cosas
        ENTERPRISE,         // Sistemas empresariales (ERP, CRM, etc.)

        // Especialidades por rol
        UX_DESIGN,          // Diseño de experiencia de usuario
        TECH_LEAD           // Liderazgo técnico y coordinación
    }

    /**
     * Enumerado que representa los estados posibles de un proyecto en el sistema.
     */
    enum EstadoProyecto {
        PROPUESTO,          // Proyecto propuesto pero aún no aprobado
        PLANIFICACION,      // En fase de planificación inicial
        INICIADO,           // Proyecto iniciado, en desarrollo activo
        PAUSADO,            // Temporalmente en pausa
        EN_RIESGO,          // Progresando pero con riesgos identificados
        RETRASADO,          // Progresando pero con retraso respecto al cronograma
        FINALIZADO,         // Proyecto concluido con éxito
        CANCELADO           // Proyecto cancelado antes de su finalización
    }

    /**
     * Enumerado que representa los estados posibles de una tarea en el sistema.
     */
    enum EstadoTarea {
        PENDIENTE,          // Tarea definida pero aún no iniciada
        EN_PROGRESO,        // Tarea en desarrollo activo
        BLOQUEADA,          // Tarea que no puede avanzar por algún impedimento
        COMPLETADA,         // Tarea finalizada con éxito
        CANCELADA,          // Tarea cancelada antes de su finalización
        EN_REVISION         // Tarea completada pero pendiente de revisión o pruebas
    }

    /**
     * Enumerado que representa los niveles de prioridad para tareas y proyectos.
     */
    enum Prioridad {
        CRITICA,            // Máxima prioridad, atención inmediata requerida
        ALTA,               // Alta prioridad, atención prioritaria
        MEDIA,              // Prioridad estándar
        BAJA                // Baja prioridad, puede posponerse si es necesario
    }

    /**
     * Enumerado que representa las razones de rechazo para facilitar el análisis.
     */
    enum RazonRechazo {
        RECURSOS_NO_DISPONIBLES,       // Los recursos necesarios no están disponibles
        CONFLICTO_CALENDARIO,          // Existe un conflicto de calendario con otras tareas
        BAJA_PRIORIDAD,                // La prioridad es demasiado baja para ser aceptada ahora
        DEPENDENCIAS_NO_CUMPLIDAS,     // Existen dependencias que aún no han sido satisfechas
        INVIABILIDAD_TECNICA,          // No es técnicamente viable con los recursos actuales
        RESTRICCIONES_PRESUPUESTARIAS  // No hay presupuesto suficiente para la tarea/proyecto
    }

    /**
     * Enumerado que define los posibles objetivos estratégicos o propósitos
     * para la formación de coaliciones entre equipos de desarrollo. Cada valor
     * representa un tipo distinto de colaboración que puede establecerse para
     * abordar necesidades específicas dentro de los proyectos de software.
     */
    enum ObjetivoCoalicion {
        /**
         * Colaboración para desarrollar una funcionalidad compleja que requiere
         * la integración de múltiples especializaciones técnicas.
         */
        DESARROLLO_FUNCIONALIDAD_COMPLEJA,

        /**
         * Coalición temporal centrada en resolver un problema técnico específico
         * que está bloqueando el avance de uno o más proyectos.
         */
        RESOLUCION_PROBLEMA_TECNICO,

        /**
         * Colaboración para mejorar significativamente el rendimiento, escalabilidad
         * o eficiencia de un componente o sistema existente.
         */
        OPTIMIZACION_RENDIMIENTO,

        /**
         * Coalición formada para asegurar la correcta integración entre diferentes
         * componentes, servicios o sistemas desarrollados por equipos distintos.
         */
        INTEGRACION_SISTEMAS,

        /**
         * Colaboración intensiva para realizar pruebas exhaustivas de calidad,
         * seguridad o rendimiento que requieren diversas perspectivas técnicas.
         */
        TESTING_AVANZADO,

        /**
         * Coalición enfocada en compartir conocimientos, metodologías o técnicas
         * especializadas entre equipos para elevar capacidades generales.
         */
        TRANSFERENCIA_CONOCIMIENTO,

        /**
         * Colaboración urgente para responder a incidentes críticos, fallos en
         * producción o situaciones que requieren intervención inmediata.
         */
        GESTION_CRISIS,

        /**
         * Coalición experimental para explorar nuevas tecnologías, arquitecturas
         * o enfoques innovadores que podrían beneficiar futuros proyectos.
         */
        INNOVACION_EXPERIMENTACION,

        /**
         * Colaboración para reestructurar o refactorizar componentes o sistemas
         * críticos que afectan a múltiples proyectos o equipos.
         */
        REFACTORIZACION_CODIGO,

        /**
         * Coalición centrada en resolver dependencias técnicas complejas entre
         * diferentes proyectos o componentes para mantener la coherencia global.
         */
        RESOLUCION_DEPENDENCIAS,

        /**
         * Colaboración para cumplir con un plazo crítico que requiere la
         * concentración temporal de recursos en un objetivo específico.
         */
        ACELERACION_ENTREGA
    }

    /**
     * Enumerado que representa los tipos específicos de errores que pueden ocurrir
     * durante el proceso de asignación de recursos.
     */
    enum ErrorAsignacionRecurso {
        /**
         * El recurso solicitado ya ha sido reservado para otro proyecto o tarea
         * durante el período solicitado.
         */
        RECURSO_YA_RESERVADO,

        /**
         * No hay suficientes unidades disponibles del recurso solicitado para
         * satisfacer la cantidad requerida.
         */
        CANTIDAD_INSUFICIENTE,

        /**
         * El agente que realiza la solicitud no tiene los permisos necesarios
         * para acceder al recurso solicitado.
         */
        PERMISOS_INSUFICIENTES,

        /**
         * La asignación solicitada crearía un conflicto con otra asignación
         * existente que tiene mayor prioridad.
         */
        CONFLICTO_PRIORIDAD,

        /**
         * El recurso existe pero está temporalmente fuera de servicio o
         * no disponible por mantenimiento.
         */
        RECURSO_NO_OPERATIVO,

        /**
         * El recurso solicitado existe pero no está correctamente configurado
         * para el uso solicitado.
         */
        ERROR_CONFIGURACION,

        /**
         * La solicitud fue recibida pero el sistema de recursos está sobrecargado
         * y no puede procesarla en este momento.
         */
        SISTEMA_SOBRECARGADO,

        /**
         * Se ha producido un error en la comunicación con el sistema que gestiona
         * el recurso específico.
         */
        ERROR_COMUNICACION,

        /**
         * El recurso solicitado no existe en el inventario del sistema.
         */
        RECURSO_INEXISTENTE,

        /**
         * Los parámetros de la solicitud son inválidos (por ejemplo, fechas
         * inconsistentes o valores fuera de rango).
         */
        PARAMETROS_INVALIDOS
    }

    /**
     * Enumerado que representa las razones específicas por las que un Agente de Tarea
     * puede rechazar la asignación de una tarea propuesta por el Agente Coordinador.
     */
    enum RazonRechazoTarea {
        /**
         * El equipo/agente ya tiene asignada una carga de trabajo que le impide
         * asumir tareas adicionales en el período solicitado.
         */
        SOBRECARGA_TRABAJO,

        /**
         * El equipo/agente carece de una o más habilidades técnicas específicas
         * que son necesarias para completar adecuadamente la tarea.
         */
        FALTA_HABILIDADES_TECNICAS,

        /**
         * La tarea propuesta depende de otras tareas que aún no han sido completadas,
         * lo que impide comenzar el trabajo.
         */
        DEPENDENCIAS_NO_SATISFECHAS,

        /**
         * El período propuesto para la tarea se solapa con otras obligaciones
         * o compromisos previamente adquiridos por el equipo/agente.
         */
        CONFLICTO_CALENDARIO,

        /**
         * No se dispone de los recursos necesarios (hardware, software, licencias, etc.)
         * para realizar la tarea durante el período propuesto.
         */
        RECURSOS_INSUFICIENTES,

        /**
         * El plazo asignado para completar la tarea es considerado insuficiente o
         * irrealista dada la complejidad del trabajo a realizar.
         */
        PLAZO_IRREALISTA,

        /**
         * La prioridad asignada a la tarea entra en conflicto con la prioridad de
         * otras tareas ya aceptadas y en progreso.
         */
        CONFLICTO_PRIORIDAD,

        /**
         * Existen restricciones o limitaciones técnicas que impiden la realización
         * de la tarea según los parámetros especificados.
         */
        RESTRICCIONES_TECNICAS,

        /**
         * El equipo/agente carece del conocimiento específico del dominio o del contexto
         * del proyecto necesario para realizar la tarea con garantías.
         */
        CONOCIMIENTO_DOMINIO_INSUFICIENTE
    }

    /**
     * Enumerado que define los motivos por los que un Agente de Tarea puede
     * rechazar una solicitud de suscripción para recibir actualizaciones.
     */
    enum MotivoRechazoSuscripcion {
        /**
         * El agente ha alcanzado su límite máximo de suscripciones activas y no puede
         * gestionar suscripciones adicionales en este momento.
         */
        LIMITE_SUSCRIPCIONES_ALCANZADO,

        /**
         * Uno o más proyectos o tareas especificados en la solicitud no existen o
         * no están bajo la gestión del agente receptor.
         */
        PROYECTO_NO_ENCONTRADO,

        /**
         * El proyecto especificado existe pero está actualmente inactivo, en pausa,
         * o ha sido completado, por lo que no generará actualizaciones.
         */
        PROYECTO_NO_ACTIVO,

        /**
         * El sistema de monitoreo para el proyecto especificado está temporalmente
         * deshabilitado o en mantenimiento.
         */
        SISTEMA_MONITOREO_NO_DISPONIBLE,

        /**
         * La sobrecarga actual del sistema no permite gestionar adecuadamente la
         * solicitud de suscripción en este momento.
         */
        SOBRECARGA_SISTEMA,

        /**
         * El formato de la solicitud es incorrecto o contiene parámetros inválidos
         * que impiden su procesamiento adecuado.
         */
        FORMATO_SOLICITUD_INVALIDO
    }

    /**
     * Enumerado que define los recursos necesarios para el desarrollo de software,
     * junto con el tiempo estimado de uso (en horas) y las especialidades de desarrollo
     * con las que están asociados.
     */
    enum RecursoDesarrollo {
        // Recursos hardware
        SERVIDOR_DESARROLLO(40, LineasDesarrollo.BACKEND, LineasDesarrollo.DEVOPS, LineasDesarrollo.CLOUD),
        SERVIDOR_PRUEBAS(24, LineasDesarrollo.QA, LineasDesarrollo.DEVOPS),
        ENTORNO_CI_CD(30, LineasDesarrollo.DEVOPS, LineasDesarrollo.CLOUD),

        // Recursos de computación
        CLUSTER_COMPUTACION(48, LineasDesarrollo.IA_ML, LineasDesarrollo.DATOS),
        GPU_ESPECIALIZADA(36, LineasDesarrollo.IA_ML),

        // Dispositivos para desarrollo y pruebas
        DISPOSITIVOS_MOVILES(20, LineasDesarrollo.MOBILE, LineasDesarrollo.QA),
        DISPOSITIVOS_IOT(15, LineasDesarrollo.EMBEDDED_IOT),

        // Licencias y herramientas de software
        LICENCIA_IDE_PROFESIONAL(60, LineasDesarrollo.FRONTEND, LineasDesarrollo.BACKEND,
                LineasDesarrollo.FULLSTACK, LineasDesarrollo.MOBILE),
        LICENCIA_HERRAMIENTAS_DISENO(25, LineasDesarrollo.FRONTEND, LineasDesarrollo.UX_DESIGN),
        LICENCIA_ANALISIS_CODIGO(30, LineasDesarrollo.SEGURIDAD, LineasDesarrollo.QA),
        LICENCIA_BBDD_ENTERPRISE(45, LineasDesarrollo.DATOS, LineasDesarrollo.BACKEND,
                LineasDesarrollo.ENTERPRISE),

        // Entornos cloud/SaaS
        ENTORNO_CLOUD_DESARROLLO(50, LineasDesarrollo.CLOUD, LineasDesarrollo.DEVOPS,
                LineasDesarrollo.FULLSTACK),
        SERVICIOS_AI_CLOUD(40, LineasDesarrollo.IA_ML, LineasDesarrollo.CLOUD),

        // Recursos humanos especializados (medidos en horas-consultoría)
        CONSULTOR_SEGURIDAD(20, LineasDesarrollo.SEGURIDAD),
        CONSULTOR_UX(15, LineasDesarrollo.UX_DESIGN, LineasDesarrollo.FRONTEND),
        ARQUITECTO_SOLUCIONES(25, LineasDesarrollo.ARQUITECTURA, LineasDesarrollo.TECH_LEAD);

        // Atributos del enumerado
        private final int tiempoUsoHoras;
        private final List<LineasDesarrollo> lineasAsociadas;

        /**
         * Constructor para los recursos de desarrollo.
         *
         * @param tiempoUsoHoras Tiempo estimado de uso necesario en horas
         * @param lineas líneas de desarrollo asociadas con este recurso
         */
        RecursoDesarrollo(int tiempoUsoHoras, LineasDesarrollo... lineas) {
            this.tiempoUsoHoras = tiempoUsoHoras;
            this.lineasAsociadas = Arrays.asList(lineas);
        }

        /**
         * Obtiene el tiempo de uso necesario para este recurso en horas.
         *
         * @return Tiempo de uso en horas
         */
        public int getTiempoUsoHoras() {
            return tiempoUsoHoras;
        }

        /**
         * Obtiene las líneas de desarrollo asociadas con este recurso.
         *
         * @return Lista de líneas asociadas
         */
        public List<LineasDesarrollo> getLineasAsociadas() {
            return lineasAsociadas;
        }

        /**
         * Comprueba si este recurso está asociado con una línea específica.
         *
         * @param linea línea a comprobar
         * @return true si el recurso está asociado con la línea, false en caso contrario
         */
        public boolean esAsociadoConEspecialidad(LineasDesarrollo linea) {
            return lineasAsociadas.contains(linea);
        }

        /**
         * Obtiene todos los recursos asociados con una línea específica.
         *
         * @param linea línea para la que buscar recursos
         * @return Lista de recursos asociados con la línea
         */
        public static List<RecursoDesarrollo> getRecursosParaEspecialidad(LineasDesarrollo linea) {
            return Arrays.stream(RecursoDesarrollo.values())
                    .filter(recurso -> recurso.esAsociadoConEspecialidad(linea))
                    .toList();
        }
    }

    /**
     * Enumerado que define los diferentes niveles de experiencia para un equipo de desarrollo,
     * junto con un factor que afecta al tiempo necesario para completar las líneas de trabajo.
     *
     * El factor de tiempo funciona como un multiplicador:
     * - Valores < 1.0: El equipo es más eficiente (reduce el tiempo estándar)
     * - Valor = 1.0: Tiempo estándar de referencia
     * - Valores > 1.0: El equipo requiere más tiempo del estándar
     */
    enum ExperienciaEquipo {
        // Niveles básicos de formación y experiencia
        INICIAL(2.0, "Equipo recién formado sin experiencia previa trabajando juntos"),
        APRENDIZAJE(1.7, "Equipo en fase de aprendizaje, estableciendo dinámicas básicas"),

        // Niveles de desarrollo y establecimiento
        DEFINIDO(1.4, "Equipo con procesos básicos definidos, mejorando la colaboración"),
        COHESIONADO(1.2, "Equipo con experiencia trabajando juntos y roles bien definidos"),
        ESTANDARIZADO(1.0, "Equipo que trabaja a velocidad estándar con procesos documentados"),

        // Niveles de eficiencia y mejora
        EFICIENTE(0.85, "Equipo con alta productividad y comunicación fluida"),
        OPTIMIZADO(0.75, "Equipo con procesos optimizados y gestión eficaz de recursos"),

        // Niveles de excelencia y especialización
        ALTO_RENDIMIENTO(0.65, "Equipo de alto rendimiento con excelente coordinación"),
        ESPECIALIZADO(0.55, "Equipo con profunda especialización en su dominio técnico"),
        ELITE(0.45, "Equipo de referencia en la industria, altamente innovador y eficiente");

        private final double factorTiempo;
        private final String descripcion;

        /**
         * Constructor para los niveles de madurez de un equipo.
         *
         * @param factorTiempo Factor multiplicador que afecta al tiempo de desarrollo
         * @param descripcion Descripción detallada del nivel de madurez
         */
        ExperienciaEquipo(double factorTiempo, String descripcion) {
            this.factorTiempo = factorTiempo;
            this.descripcion = descripcion;
        }

        /**
         * Obtiene el factor multiplicador que afecta al tiempo de desarrollo.
         *
         * @return Factor multiplicador del tiempo
         */
        public double getFactorTiempo() {
            return factorTiempo;
        }

        /**
         * Obtiene la descripción detallada del nivel de madurez.
         *
         * @return Descripción textual del nivel
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Calcula el tiempo ajustado según el nivel de madurez del equipo.
         *
         * @param tiempoEstandar Tiempo estándar estimado para la tarea (en horas)
         * @return Tiempo ajustado según la madurez del equipo
         */
        public double calcularTiempoAjustado(double tiempoEstandar) {
            return tiempoEstandar * factorTiempo;
        }

        /**
         * Determina si un equipo con este nivel de madurez es adecuado para
         * trabajar en tareas que requieran un tiempo de ejecución crítico.
         *
         * @return true si el equipo es adecuado para tareas de tiempo crítico
         */
        public boolean esAdecuadoParaTiempoCritico() {
            // Solo equipos con factor de tiempo menor o igual a 1.0 son considerados
            // adecuados para tareas con restricciones críticas de tiempo
            return factorTiempo <= 1.0;
        }
    }

    /**
     * Constantes para los puntos de acción que cada tipo de agente puede utilizar
     * en una interacción del sistema.
     */
    int PUNTOS_ACCION_AGENTE_TAREA = 100;
    int PUNTOS_ACCION_AGENTE_RECURSOS = 150;
    int PUNTOS_ACCION_AGENTE_DECISION = 200;
    int PUNTOS_ACCION_AGENTE_COORDINADOR = 250;

    /**
     * Constantes para límites y umbrales del sistema.
     */
    int MAX_TAREAS_POR_AGENTE = 5;
    int MIN_HABILIDADES_REQUERIDAS = 1;
    int MAX_MIEMBROS_COALICION = 8;
    int TIEMPO_MAXIMO_COALICION_HORAS = 160; // Una semana de trabajo en horas
    int TIEMPO_MIN_NOTIFICACION_MINUTOS = 30;
    double UMBRAL_CARGA_CRITICA = 0.85; // 85% de capacidad se considera carga crítica

    /**
     * Constantes para costos de estrategias y operaciones.
     */
    int COSTO_MONITOREO_BASICO = 2;
    int COSTO_ANALISIS_ESTADO = 3;
    int COSTO_PREPARACION_COALICION = 5;
    int COSTO_EVALUACION_PROPUESTA = 4;
    int COSTO_REASIGNACION_RECURSOS = 6;

    /**
     * Prioridades por defecto para diferentes tipos de operaciones.
     */
    Prioridad PRIORIDAD_DEFECTO_NUEVA_TAREA = Prioridad.MEDIA;
    Prioridad PRIORIDAD_DEFECTO_PROBLEMA_TECNICO = Prioridad.ALTA;
    Prioridad PRIORIDAD_DEFECTO_MANTENIMIENTO = Prioridad.BAJA;
    Prioridad PRIORIDAD_DEFECTO_INNOVACION = Prioridad.BAJA;
    Prioridad PRIORIDAD_DEFECTO_ENTREGA_CLIENTE = Prioridad.ALTA;
}