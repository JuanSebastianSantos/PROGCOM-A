{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyOmeWFqfCJSpkX+/EsjYR/W",
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
        "<a href=\"https://colab.research.google.com/github/JuanSebastianSantos/PROGCOM-A/blob/main/pierda_papel_tijera_py.py\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "K67iQoA_OGjv"
      },
      "outputs": [],
      "source": [
        "import tkinter as tk\n",
        "from tkinter import messagebox\n",
        "import random\n",
        "import pygame\n",
        "\n",
        "# Ventana principal\n",
        "root = tk.Tk()\n",
        "root.title(\"Piedra papel y tijera\")\n",
        "\n",
        "# Elecciones\n",
        "choices = [\"Piedra\", \"Papel\", \"Tijera\"]\n",
        "\n",
        "# Funcion para determinar ganador\n",
        "def play(user_choice):\n",
        "    computer_choice = random.choice(choices)\n",
        "    result = \"\"\n",
        "    if user_choice == computer_choice:\n",
        "        result = \"Empate!\"\n",
        "    elif (user_choice == \"Piedra\" and computer_choice == \"Tijera\") or \\\n",
        "         (user_choice == \"Papel\" and computer_choice == \"Piedra\") or \\\n",
        "         (user_choice == \"Tijera\" and computer_choice == \"Papel\"):\n",
        "        result = \"Ganaste!\"\n",
        "    else:\n",
        "        result = \"La computadora gana!\"\n",
        "    messagebox.showinfo(\"Resultado\", f\"Elejiste {user_choice}\\nComputadora eligio {computer_choice}\\n{result}\")\n",
        "\n",
        "# Layout\n",
        "tk.Label(root, text=\"Elije:\").pack(pady=10)\n",
        "\n",
        "btn_frame = tk.Frame(root)\n",
        "btn_frame.pack(pady=10)\n",
        "\n",
        "for choice in choices:\n",
        "    tk.Button(btn_frame, text=choice, width=10, command=lambda c=choice: play(c)).pack(side=tk.LEFT, padx=5)\n",
        "\n",
        "\n",
        "Imagenes_juego = []\n",
        "Imagenes_jurgo = [\"imagenes/Piedra_1.jpg\",\"imagenes/Piedra_2.jpg\", \"imagenes/Papel_1.jpg\", \"imagenes/Papel_2.jpg\" \"imagenes/Tijera_1.jpg\", \"imagenes/Tijera_2.jpg\"]\n",
        "\n",
        "root.mainloop()"
      ]
    }
  ]
}