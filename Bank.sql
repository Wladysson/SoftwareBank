--
-- PostgreSQL database dump
--

-- Dumped from database version 17.0
-- Dumped by pg_dump version 17.0

-- Started on 2025-04-13 08:13:05

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
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
-- TOC entry 224 (class 1259 OID 17441)
-- Name: auditor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.auditor (
    id integer NOT NULL,
    pessoal_id integer,
    digito character varying(10),
    data character varying(10),
    operante character varying(100),
    classificacao character varying(50)
);


ALTER TABLE public.auditor OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 17440)
-- Name: auditor_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.auditor_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.auditor_id_seq OWNER TO postgres;

--
-- TOC entry 4924 (class 0 OID 0)
-- Dependencies: 223
-- Name: auditor_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.auditor_id_seq OWNED BY public.auditor.id;


--
-- TOC entry 218 (class 1259 OID 17402)
-- Name: cadastro_pessoal; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cadastro_pessoal (
    id integer NOT NULL,
    nome_completo character varying(255) NOT NULL,
    data_nascimento date NOT NULL,
    cpf character varying(14) NOT NULL,
    sexo character varying(10),
    identidade character varying(20),
    orgao_emissor character varying(50),
    nacionalidade character varying(50),
    nome_mae character varying(255),
    estado_civil character varying(50),
    conjugue character varying(255),
    profissao character varying(100),
    tipo_cliente character varying(50),
    complemento text,
    telefone character varying(20),
    raca_cor character varying(50)
);


ALTER TABLE public.cadastro_pessoal OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 17401)
-- Name: cadastro_pessoal_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cadastro_pessoal_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.cadastro_pessoal_id_seq OWNER TO postgres;

--
-- TOC entry 4925 (class 0 OID 0)
-- Dependencies: 217
-- Name: cadastro_pessoal_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cadastro_pessoal_id_seq OWNED BY public.cadastro_pessoal.id;


--
-- TOC entry 222 (class 1259 OID 17427)
-- Name: dados_bancarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.dados_bancarios (
    id integer NOT NULL,
    pessoal_id integer,
    agencia character varying(20),
    codigo character varying(20),
    tipo_conta character varying(50),
    numero_conta character varying(50),
    nome_conta character varying(255),
    operacao character varying(20),
    tipo_convenio character varying(50),
    codigo_bic character varying(20),
    iban character varying(50),
    cnpj character varying(20),
    observacoes text
);


ALTER TABLE public.dados_bancarios OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 17426)
-- Name: dados_bancarios_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.dados_bancarios_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.dados_bancarios_id_seq OWNER TO postgres;

--
-- TOC entry 4926 (class 0 OID 0)
-- Dependencies: 221
-- Name: dados_bancarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.dados_bancarios_id_seq OWNED BY public.dados_bancarios.id;


--
-- TOC entry 220 (class 1259 OID 17413)
-- Name: endereco_residencial; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.endereco_residencial (
    id integer NOT NULL,
    pessoal_id integer,
    cep character varying(10),
    estado character varying(50),
    cidade character varying(100),
    endereco character varying(255),
    rua character varying(255),
    numero integer,
    bairro character varying(100),
    complemento text
);


ALTER TABLE public.endereco_residencial OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 17412)
-- Name: endereco_residencial_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.endereco_residencial_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.endereco_residencial_id_seq OWNER TO postgres;

--
-- TOC entry 4927 (class 0 OID 0)
-- Dependencies: 219
-- Name: endereco_residencial_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.endereco_residencial_id_seq OWNED BY public.endereco_residencial.id;


--
-- TOC entry 228 (class 1259 OID 17467)
-- Name: movimento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.movimento (
    id integer NOT NULL,
    pessoal_id integer,
    un character varying(50),
    controle character varying(50),
    operacao character varying(50),
    renda character varying(50),
    limite character varying(50),
    quantia character varying(50),
    juros character varying(50),
    multa character varying(50),
    iof character varying(50),
    credito character varying(50),
    taxas character varying(50),
    mora character varying(50),
    capital character varying(50),
    lucros character varying(50),
    capitalizacao character varying(50),
    pagavel character varying(50),
    codigo character varying(50),
    sac character varying(50),
    lbl_nome_cliente character varying(255),
    avalista character varying(255),
    tipo character varying(50),
    parcelas character varying(50),
    margem character varying(50),
    tipoconta character varying(50),
    status character varying(50),
    fase character varying(50),
    obs text
);


ALTER TABLE public.movimento OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 17466)
-- Name: movimento_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.movimento_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.movimento_id_seq OWNER TO postgres;

--
-- TOC entry 4928 (class 0 OID 0)
-- Dependencies: 227
-- Name: movimento_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.movimento_id_seq OWNED BY public.movimento.id;


--
-- TOC entry 226 (class 1259 OID 17453)
-- Name: pesquisa; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pesquisa (
    id integer NOT NULL,
    pessoal_id integer,
    nome character varying(255),
    cpf character varying(14),
    data date
);


ALTER TABLE public.pesquisa OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 17452)
-- Name: pesquisa_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.pesquisa_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.pesquisa_id_seq OWNER TO postgres;

--
-- TOC entry 4929 (class 0 OID 0)
-- Dependencies: 225
-- Name: pesquisa_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.pesquisa_id_seq OWNED BY public.pesquisa.id;


--
-- TOC entry 230 (class 1259 OID 17481)
-- Name: vigencia; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vigencia (
    id integer NOT NULL,
    movimento_id integer,
    data_inicio date,
    data_fim date,
    carencia character varying(50),
    prazos character varying(50),
    indice character varying(50),
    valores character varying(50),
    vencimento date,
    situacao character varying(50),
    peridiocidade character varying(50),
    formpg character varying(100),
    divida character varying(100),
    conciliacao character varying(100),
    vigstatus character varying(100),
    obsvig text,
    CONSTRAINT chk_vigencia_data_fim_format CHECK (((data_fim)::text ~ '^\d{4}-\d{2}-\d{2}$'::text)),
    CONSTRAINT chk_vigencia_data_inicio_format CHECK (((data_inicio)::text ~ '^\d{4}-\d{2}-\d{2}$'::text)),
    CONSTRAINT chk_vigencia_vencimento_format CHECK (((vencimento)::text ~ '^\d{4}-\d{2}-\d{2}$'::text))
);


ALTER TABLE public.vigencia OWNER TO postgres;

--
-- TOC entry 229 (class 1259 OID 17480)
-- Name: vigencia_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.vigencia_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.vigencia_id_seq OWNER TO postgres;

--
-- TOC entry 4930 (class 0 OID 0)
-- Dependencies: 229
-- Name: vigencia_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.vigencia_id_seq OWNED BY public.vigencia.id;


--
-- TOC entry 4728 (class 2604 OID 17444)
-- Name: auditor id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auditor ALTER COLUMN id SET DEFAULT nextval('public.auditor_id_seq'::regclass);


--
-- TOC entry 4725 (class 2604 OID 17405)
-- Name: cadastro_pessoal id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cadastro_pessoal ALTER COLUMN id SET DEFAULT nextval('public.cadastro_pessoal_id_seq'::regclass);


--
-- TOC entry 4727 (class 2604 OID 17430)
-- Name: dados_bancarios id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dados_bancarios ALTER COLUMN id SET DEFAULT nextval('public.dados_bancarios_id_seq'::regclass);


--
-- TOC entry 4726 (class 2604 OID 17416)
-- Name: endereco_residencial id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco_residencial ALTER COLUMN id SET DEFAULT nextval('public.endereco_residencial_id_seq'::regclass);


--
-- TOC entry 4730 (class 2604 OID 17470)
-- Name: movimento id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movimento ALTER COLUMN id SET DEFAULT nextval('public.movimento_id_seq'::regclass);


--
-- TOC entry 4729 (class 2604 OID 17456)
-- Name: pesquisa id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pesquisa ALTER COLUMN id SET DEFAULT nextval('public.pesquisa_id_seq'::regclass);


--
-- TOC entry 4731 (class 2604 OID 17484)
-- Name: vigencia id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vigencia ALTER COLUMN id SET DEFAULT nextval('public.vigencia_id_seq'::regclass);


--
-- TOC entry 4912 (class 0 OID 17441)
-- Dependencies: 224
-- Data for Name: auditor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.auditor (id, pessoal_id, digito, data, operante, classificacao) FROM stdin;
1	2	04	2025-01-31	guilherme 	7
2	3	01	2025-04-05	wladysson	643
3	4	05	2025-02-13	pedro	0356
4	5	01	2025-02-14		
\.


--
-- TOC entry 4906 (class 0 OID 17402)
-- Dependencies: 218
-- Data for Name: cadastro_pessoal; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cadastro_pessoal (id, nome_completo, data_nascimento, cpf, sexo, identidade, orgao_emissor, nacionalidade, nome_mae, estado_civil, conjugue, profissao, tipo_cliente, complemento, telefone, raca_cor) FROM stdin;
1	carlos andrade	1998-02-14	62354987102	Masculino	693481257	02	Brasil	maria de fatima 	casado	francisca bento freire	motorista 	Pessoa Física	sem 	85992147196	Pardo
2	maria de fatima 	1997-06-10	96584712365	Feminino	97645273	10	Brasil	antoneide 	vilva 	sem 	dona de casa	Pessoa Física	sem	85996321475	Pardo
3	carlos augusto	1978-04-23	97645312	Masculino	748564	1	Brasil	maria fe fatima	casado	sn	carteiro	Pessoa Física	hddjdh	85946413245	Negro
4	wladysson araujo	1998-02-14	9764531254	Masculino	66421349	02	Brasil	maria	solteiro	sn	ti	Pessoa Física	nenhum	85966532147	Branco
5	pedro castro	1997-02-03	987654321	Masculino	76645312	03	Brasil	angela	solteiro	nenhum	pedreiro	Pessoa Física	sem complemto	85996321475	Branco
\.


--
-- TOC entry 4910 (class 0 OID 17427)
-- Dependencies: 222
-- Data for Name: dados_bancarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.dados_bancarios (id, pessoal_id, agencia, codigo, tipo_conta, numero_conta, nome_conta, operacao, tipo_convenio, codigo_bic, iban, cnpj, observacoes) FROM stdin;
1	1	011100	4	Conta Corrente	236	47	4	Empréstimo Consignado	1	20	000	sem obs
2	2	01	59	Conta Corrente	74631	41	1	Outros	4	47	0	sem 
3	3	4879	02	Conta Corrente	3652	98	74	Empréstimo Consignado	41	326	97546785	sn
4	4	8941	2	Conta Corrente	1456	74	4	Empréstimo Consignado	642	42	97645	sn
5	5	021106	05	Conta Corrente	8945	4125	07	Empréstimo Consignado	641	124	645197	sem obs
\.


--
-- TOC entry 4908 (class 0 OID 17413)
-- Dependencies: 220
-- Data for Name: endereco_residencial; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.endereco_residencial (id, pessoal_id, cep, estado, cidade, endereco, rua, numero, bairro, complemento) FROM stdin;
1	1	62748	ceara	fortaleza 	joao paulino neto	rua h	65	centro	sem 
2	2	62748000	ceara	quixada	rua das flores 	campos verdes 	58	centro 	sem 
3	3	62748	ceara	fortaleza	rua das flores	85	966	centro	sn
4	4	62841	ceara	capistrano	rua das flores	rua a 	23	mucuna	sn 
5	5	62749000	ceara	pereiros	rua das rosas	52	987	centro	sn 
\.


--
-- TOC entry 4916 (class 0 OID 17467)
-- Dependencies: 228
-- Data for Name: movimento; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.movimento (id, pessoal_id, un, controle, operacao, renda, limite, quantia, juros, multa, iof, credito, taxas, mora, capital, lucros, capitalizacao, pagavel, codigo, sac, lbl_nome_cliente, avalista, tipo, parcelas, margem, tipoconta, status, fase, obs) FROM stdin;
1	\N	10	4	5	1000	1000	10	1	2	4	7	4	2	0	0	0	1000	10	0	carlos andrade	pedo	Pessoa Física	x1 parcelas	Margem Consignável	Conta Corrente	Concluído	Em Análise	sem obs
2	\N	64513	45	963	1000	2000	400	02	01	1	10	25	01	29	3	21	2500	021106	00	carlos augusto	pedro	Pessoa Física	x10 parcelas	Margem Consignável	Conta Corrente	Concluído	Em Análise	no aguardo
3	\N	74	5231	9764	4000	5000	1000	2	3	5	21	41	4	0	0	10	6700	20	10	pedro castro	wladysson	Pessoa Física	x5 parcelas	Margem Consignável	Conta Corrente	Concluído	Em Análise	sem obs
\.


--
-- TOC entry 4914 (class 0 OID 17453)
-- Dependencies: 226
-- Data for Name: pesquisa; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pesquisa (id, pessoal_id, nome, cpf, data) FROM stdin;
1	\N	carlos andrade	62354987102	1998-02-14
2	\N	carlos augusto	97645312	1978-04-23
3	\N	pedro castro	987654321	1997-02-03
5	\N	wladysson araujo	9764531254	1998-02-14
\.


--
-- TOC entry 4918 (class 0 OID 17481)
-- Dependencies: 230
-- Data for Name: vigencia; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.vigencia (id, movimento_id, data_inicio, data_fim, carencia, prazos, indice, valores, vencimento, situacao, peridiocidade, formpg, divida, conciliacao, vigstatus, obsvig) FROM stdin;
1	\N	2025-01-31	2028-04-13	0	0	0	100	2025-02-15	Ativo	Mensal	\N	\N	\N	\N	\N
2	\N	2025-05-12	2027-05-12	2	60	0	100	2027-05-29	Ativo	Bimestral	Debito da Conta 	Emprestimo	Conciliado	Ativo	em analise
3	\N	2025-02-10	2028-05-14	10	23	0	100	2025-02-28	Ativo	Mensal	Debito da Conta 	Emprestimo	Conciliado	Ativo	sen
\.


--
-- TOC entry 4931 (class 0 OID 0)
-- Dependencies: 223
-- Name: auditor_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.auditor_id_seq', 4, true);


--
-- TOC entry 4932 (class 0 OID 0)
-- Dependencies: 217
-- Name: cadastro_pessoal_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cadastro_pessoal_id_seq', 5, true);


--
-- TOC entry 4933 (class 0 OID 0)
-- Dependencies: 221
-- Name: dados_bancarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.dados_bancarios_id_seq', 5, true);


--
-- TOC entry 4934 (class 0 OID 0)
-- Dependencies: 219
-- Name: endereco_residencial_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.endereco_residencial_id_seq', 5, true);


--
-- TOC entry 4935 (class 0 OID 0)
-- Dependencies: 227
-- Name: movimento_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.movimento_id_seq', 4, true);


--
-- TOC entry 4936 (class 0 OID 0)
-- Dependencies: 225
-- Name: pesquisa_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pesquisa_id_seq', 6, true);


--
-- TOC entry 4937 (class 0 OID 0)
-- Dependencies: 229
-- Name: vigencia_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.vigencia_id_seq', 3, true);


--
-- TOC entry 4744 (class 2606 OID 17446)
-- Name: auditor auditor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auditor
    ADD CONSTRAINT auditor_pkey PRIMARY KEY (id);


--
-- TOC entry 4736 (class 2606 OID 17411)
-- Name: cadastro_pessoal cadastro_pessoal_cpf_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cadastro_pessoal
    ADD CONSTRAINT cadastro_pessoal_cpf_key UNIQUE (cpf);


--
-- TOC entry 4738 (class 2606 OID 17409)
-- Name: cadastro_pessoal cadastro_pessoal_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cadastro_pessoal
    ADD CONSTRAINT cadastro_pessoal_pkey PRIMARY KEY (id);


--
-- TOC entry 4742 (class 2606 OID 17434)
-- Name: dados_bancarios dados_bancarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dados_bancarios
    ADD CONSTRAINT dados_bancarios_pkey PRIMARY KEY (id);


--
-- TOC entry 4740 (class 2606 OID 17420)
-- Name: endereco_residencial endereco_residencial_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco_residencial
    ADD CONSTRAINT endereco_residencial_pkey PRIMARY KEY (id);


--
-- TOC entry 4750 (class 2606 OID 17474)
-- Name: movimento movimento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movimento
    ADD CONSTRAINT movimento_pkey PRIMARY KEY (id);


--
-- TOC entry 4746 (class 2606 OID 17460)
-- Name: pesquisa pesquisa_cpf_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pesquisa
    ADD CONSTRAINT pesquisa_cpf_key UNIQUE (cpf);


--
-- TOC entry 4748 (class 2606 OID 17458)
-- Name: pesquisa pesquisa_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pesquisa
    ADD CONSTRAINT pesquisa_pkey PRIMARY KEY (id);


--
-- TOC entry 4752 (class 2606 OID 17486)
-- Name: vigencia vigencia_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vigencia
    ADD CONSTRAINT vigencia_pkey PRIMARY KEY (id);


--
-- TOC entry 4755 (class 2606 OID 17447)
-- Name: auditor auditor_pessoal_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auditor
    ADD CONSTRAINT auditor_pessoal_id_fkey FOREIGN KEY (pessoal_id) REFERENCES public.cadastro_pessoal(id) ON DELETE CASCADE;


--
-- TOC entry 4754 (class 2606 OID 17435)
-- Name: dados_bancarios dados_bancarios_pessoal_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dados_bancarios
    ADD CONSTRAINT dados_bancarios_pessoal_id_fkey FOREIGN KEY (pessoal_id) REFERENCES public.cadastro_pessoal(id) ON DELETE CASCADE;


--
-- TOC entry 4753 (class 2606 OID 17421)
-- Name: endereco_residencial endereco_residencial_pessoal_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco_residencial
    ADD CONSTRAINT endereco_residencial_pessoal_id_fkey FOREIGN KEY (pessoal_id) REFERENCES public.cadastro_pessoal(id) ON DELETE CASCADE;


--
-- TOC entry 4757 (class 2606 OID 17667)
-- Name: movimento fk_pessoal; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movimento
    ADD CONSTRAINT fk_pessoal FOREIGN KEY (pessoal_id) REFERENCES public.cadastro_pessoal(id) ON DELETE CASCADE;


--
-- TOC entry 4758 (class 2606 OID 17475)
-- Name: movimento movimento_pessoal_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movimento
    ADD CONSTRAINT movimento_pessoal_id_fkey FOREIGN KEY (pessoal_id) REFERENCES public.cadastro_pessoal(id) ON DELETE CASCADE;


--
-- TOC entry 4756 (class 2606 OID 17461)
-- Name: pesquisa pesquisa_pessoal_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pesquisa
    ADD CONSTRAINT pesquisa_pessoal_id_fkey FOREIGN KEY (pessoal_id) REFERENCES public.cadastro_pessoal(id) ON DELETE CASCADE;


--
-- TOC entry 4759 (class 2606 OID 17487)
-- Name: vigencia vigencia_movimento_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vigencia
    ADD CONSTRAINT vigencia_movimento_id_fkey FOREIGN KEY (movimento_id) REFERENCES public.movimento(id) ON DELETE CASCADE;


-- Completed on 2025-04-13 08:13:05

--
-- PostgreSQL database dump complete
--

