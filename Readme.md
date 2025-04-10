# Event-Driven Microservices System

## Назначение проекта

Система представляет собой микросервисное backend-приложение с событийной архитектурой, реализованное с использованием **Apache Kafka**. Основная задача — обмен сообщениями между сервисами с возможностью конфигурации через Spring Cloud Config, авторизацией через Keycloak и централизованным управлением ресурсами.

## Архитектура проекта

Проект включает в себя следующие сервисы:

- **Producer** — публикует события в Kafka
- **Consumer** — получает и обрабатывает события от Kafka
- **cloud-config-server** — сервер централизованной конфигурации
- **cloud-config-repository** — хранилище конфигураций
- **backend-gateway-client** — API Gateway
- **backend-resources** — сервис работы с ресурсами
- **Keycloak** — система авторизации и аутентификации
- **PostgreSQL** — база данных
- **Zookeeper / Kafka** — брокер сообщений и координации
- **docker-compose** — управление инфраструктурой проекта

## Функциональные возможности

- Взаимодействие сервисов через Kafka
- Централизованное хранение и управление конфигурациями (Cloud Config)
- Аутентификация и авторизация с использованием Keycloak
- Управление доступом к ресурсам
- Контейнеризация всех сервисов с помощью Docker

## Нефункциональные требования

- **Производительность:** быстрая доставка событий между сервисами
- **Безопасность:** безопасное хранение и передача данных через Keycloak
- **Масштабируемость:** возможность расширения за счёт микросервисной архитектуры

## Стек технологий

- Java 17
- Spring Boot
- Spring Cloud Config
- Spring Cloud Gateway
- Spring Security
- Apache Kafka
- Zookeeper
- PostgreSQL
- Keycloak
- Docker, Docker Compose
- Git

## Запуск проекта

### Предварительные требования

- Установленный [JDK 17+](https://adoptium.net/)
- Установленный [Docker](https://www.docker.com/) и [Docker Compose](https://docs.docker.com/compose/)

### Шаги для запуска

1. Клонируйте репозиторий:

```bash
git clone https://github.com/yourusername/your-repo.git
cd your-repo
```

2. Создайте файл `.env` и укажите в нём переменные окружения (или используйте уже готовый).
3. Keycloak: Need add your applications to **"/etc/hosts"**

3. Запустите проект с помощью Docker Compose:

```bash
docker compose up --build -d
```

4. После запуска приложения будут доступны по адресам:

- API Gateway: http://localhost:8083
- Keycloak: http://localhost:8080
- Producer: http://localhost:${PRODUCER_PORT}
- Consumer: http://localhost:${CONSUMER_PORT}

## Структура проекта

```
.
├── backend-gateway-client
├── backend-resources
├── cloud-config-server
├── cloud-config-repository
├── consumer
├── producer
├── docker-compose.yml
├── .env
└── ...
```

---

Проект находится в активной разработке. 
