{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "name": "Gp1.PY",
      "authorship_tag": "ABX9TyOj7f+5DUU2R7kcWYrTNzaL",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/JuanSebastianSantos/PROGCOM-A/blob/main/Gp1_PY.PY\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "94amEYNm-VFR"
      },
      "outputs": [],
      "source": [
        "import random\n",
        "\n",
        "# Opciones disponibles\n",
        "OPTIONS = [\"piedra\", \"papel\", \"tijera\", \"lagarto\", \"spock\"]\n",
        "\n",
        "# Reglas de victoria\n",
        "WIN_RULES = {\n",
        "    (\"tijera\", \"papel\"): \"Tijera corta papel\",\n",
        "    (\"papel\", \"piedra\"): \"Papel envuelve piedra\",\n",
        "    (\"piedra\", \"lagarto\"): \"Piedra aplasta lagarto\",\n",
        "    (\"lagarto\", \"spock\"): \"Lagarto envenena a Spock\",\n",
        "    (\"spock\", \"tijera\"): \"Spock rompe tijera\",\n",
        "    (\"tijera\", \"lagarto\"): \"Tijera decapita lagarto\",\n",
        "    (\"lagarto\", \"papel\"): \"Lagarto devora papel\",\n",
        "    (\"papel\", \"spock\"): \"Papel desautoriza a Spock\",\n",
        "    (\"spock\", \"piedra\"): \"Spock vaporiza piedra\",\n",
        "    (\"piedra\", \"tijera\"): \"Piedra aplasta tijera\",\n",
        "}\n",
        "\n",
        "def quien_gana(player, cpu):\n",
        "    \"\"\"Determina el ganador de una ronda\"\"\"\n",
        "    if player == cpu:\n",
        "        return \"empate\", \"Empate\"\n",
        "    if (player, cpu) in WIN_RULES:\n",
        "        return \"player\", WIN_RULES[(player, cpu)]\n",
        "    if (cpu, player) in WIN_RULES:\n",
        "        return \"cpu\", WIN_RULES[(cpu, player)]\n",
        "    return \"error\", \"Movimiento inválido\"\n",
        "\n",
        "def partida_automatica(jugadas_usuario):\n",
        "    \"\"\"Simula una partida con jugadas predefinidas\"\"\"\n",
        "    score_p = score_c = 0\n",
        "    ronda = 1\n",
        "    for player in jugadas_usuario:\n",
        "        cpu = random.choice(OPTIONS)\n",
        "        ganador, razon = quien_gana(player, cpu)\n",
        "        print(f\"\\nRonda {ronda}\")\n",
        "        print(f\"Tú: {player}  |  CPU: {cpu}\")\n",
        "        if ganador == \"player\":\n",
        "            score_p += 1\n",
        "            print(\"Ganaste la ronda —\", razon)\n",
        "        elif ganador == \"cpu\":\n",
        "            score_c += 1\n",
        "            print(\"Perdiste la ronda —\", razon)\n",
        "        else:\n",
        "            print(razon)\n",
        "        ronda += 1\n",
        "\n",
        "    # Resultado final\n",
        "    print(\"\\nResultado final:\")\n",
        "    if score_p > score_c:\n",
        "        print(f\"¡GANASTE! {score_p} a {score_c}\")\n",
        "    elif score_c > score_p:\n",
        "        print(f\"Perdiste. CPU {score_c} - Tú {score_p}\")\n",
        "    else:\n",
        "        print(f\"Empate total: {score_p} - {score_c}\")\n",
        "\n",
        "def main():\n",
        "    print(\"=== Piedra, Papel, Tijera, Lagarto, Spock (Automático) ===\")\n",
        "\n",
        "    # Lista de jugadas simuladas del usuario (puedes cambiarla)\n",
        "    jugadas_usuario = [\"piedra\", \"papel\", \"spock\", \"lagarto\", \"tijera\"]\n",
        "\n",
        "    print(f\"Jugadas del usuario: {jugadas_usuario}\")\n",
        "    partida_automatica(jugadas_usuario)\n",
        "\n",
        "# Ejecutar directamente\n",
        "main()"
      ]
    }
  ]
}