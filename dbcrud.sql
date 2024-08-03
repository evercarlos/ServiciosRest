--
-- PostgreSQL database dump
--

-- Dumped from database version 12.19 (Ubuntu 12.19-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.19 (Ubuntu 12.19-0ubuntu0.20.04.1)

-- Started on 2024-08-03 15:34:01 -05

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 153777)
-- Name: empresa; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.empresa (
    id integer NOT NULL,
    nombre character varying(100),
    ruc character varying(100),
    state boolean DEFAULT true,
    tipo character varying(100)
);


ALTER TABLE public.empresa OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 153775)
-- Name: empresa_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.empresa_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.empresa_id_seq OWNER TO postgres;

--
-- TOC entry 3009 (class 0 OID 0)
-- Dependencies: 202
-- Name: empresa_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.empresa_id_seq OWNED BY public.empresa.id;


--
-- TOC entry 2872 (class 2604 OID 153780)
-- Name: empresa id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empresa ALTER COLUMN id SET DEFAULT nextval('public.empresa_id_seq'::regclass);


--
-- TOC entry 3003 (class 0 OID 153777)
-- Dependencies: 203
-- Data for Name: empresa; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.empresa VALUES (2, 'dfdfdf', 'dfdfdf', false, 'dfff');
INSERT INTO public.empresa VALUES (3, 'TECSOFEC', '65566776', false, 'PRUEBA2');
INSERT INTO public.empresa VALUES (5, 'goresam', '5689658965', true, 'EIRL');
INSERT INTO public.empresa VALUES (4, 'BALTRADING', '10467927431', true, 'SAC');
INSERT INTO public.empresa VALUES (6, 'gfgh', '65676767', true, 'SAC');
INSERT INTO public.empresa VALUES (8, '', '', false, '');
INSERT INTO public.empresa VALUES (7, '', '', false, '');


--
-- TOC entry 3010 (class 0 OID 0)
-- Dependencies: 202
-- Name: empresa_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.empresa_id_seq', 8, true);


--
-- TOC entry 2875 (class 2606 OID 153783)
-- Name: empresa empresa_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empresa
    ADD CONSTRAINT empresa_pkey PRIMARY KEY (id);


-- Completed on 2024-08-03 15:34:01 -05

--
-- PostgreSQL database dump complete
--

