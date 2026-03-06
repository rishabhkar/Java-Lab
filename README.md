# Java Labs
## Purpose
Java Labs is a long-term, hands-on Java practice repository organised around the Java sheet of Knowledge Base.xlsx.
The goal is to give every mapped Java concept a clean, scalable place for future exercises, notes, and interview preparation.
## Source of truth
This folder structure is derived from the extracted Java-sheet hierarchy provided in the repo task.
Topics are organised by:
1. Topic
2. Sub topic
3. Sub-sub topic (only when the area is practice-worthy)
## How to add future concepts
- Add new material only under the folder that matches the Java-sheet topic hierarchy.
- Create a new folder only when a concept is broad enough to host multiple future practice files.
- Keep small, theory-heavy, or terminology-only leaves inside the nearest README section.
- If the Java sheet grows later, extend the structure without changing the existing naming style.
## Folder naming conventions
- lowercase directory names
- hyphen-separated names
- no spaces
- no mixed naming styles
## About _unmapped-existing
_unmapped-existing holds legacy repository content that was already present but does not map one-to-one into the new Java-sheet-first practice structure.
This keeps the new curriculum tree clean without deleting prior work.
Current preserved legacy areas:
- legacy-src/Main.java (IntelliJ starter scaffold)
- legacy-src/search/ and legacy-src/sort/ (not present in the supplied Java sheet)
- legacy-src/classes/ and legacy-src/concurrency/ demo files (kept intact instead of force-fitting implementation files into the new README-first structure)
## Structure rules used here
- Every major topic has its own top-level folder and README.
- Broad, practice-heavy areas use grouped subfolders.
- Trivial leaves such as overview, definition, features, advantages, disadvantages, result, and terminology-only items stay as README sections.
- Design patterns use one folder per pattern, with sub-points kept inside the pattern README.
## Working style for future practice
- Add Java files later only when you are ready to implement focused practice for a mapped concept.
- Keep each practice file close to the concept it exercises.
- Update the local README when a folder grows or when grouped leaves need to be split out.
