{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyNYHwwKXiNNMZ+gN4CYMBNF",
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
        "<a href=\"https://colab.research.google.com/github/JuanSebastianSantos/PROGCOM-A/blob/main/main6.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "dQMhQhx5SZ1Y"
      },
      "outputs": [],
      "source": [
        "import java.util.*;\n",
        "\n",
        "public class Main {\n",
        "    public static void main(String[] args) {\n",
        "        List<String> lista = new ArrayList<>();\n",
        "        for (int z = 1; z <= 10; z++) {\n",
        "            if (z % 2 == 0) {\n",
        "                lista.add(z + \"es par\");\n",
        "            } else {\n",
        "                lista.add(z + \"es impar\");\n",
        "            }\n",
        "        }\n",
        "        System.out.println(\"impar o par: \" + lista);\n",
        "    }\n",
        "}"
      ]
    }
  ]
}